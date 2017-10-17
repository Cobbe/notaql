package notaql.engines.elasticsearch;

import java.net.ConnectException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.apache.hadoop.conf.Configuration;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.bson.BSONObject;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.hadoop.mr.EsOutputFormat;
import org.elasticsearch.spark.rdd.api.java.JavaEsSpark;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.json.JSONObject;

import com.google.common.collect.ImmutableMap;

import notaql.NotaQL;
import notaql.datamodel.AtomValue;
import notaql.datamodel.BooleanValue;
import notaql.datamodel.ObjectValue;
import notaql.datamodel.Step;
import notaql.datamodel.Value;
import notaql.engines.Engine;
import notaql.engines.EngineEvaluator;
import notaql.engines.elasticsearch.parser.path.ElasticsearchInputPathParser;
import notaql.engines.elasticsearch.parser.path.ElasticsearchOutputPathParser;
import notaql.engines.elasticsearch.datamodel.ValueConverter;
import notaql.evaluation.SparkTransformationEvaluator;
import notaql.model.EvaluationException;
import notaql.model.Transformation;
import notaql.model.vdata.ConstructorVData;
import notaql.model.vdata.FunctionVData;
import notaql.parser.TransformationParser;
import notaql.parser.path.InputPathParser;
import notaql.parser.path.OutputPathParser;
import scala.Tuple2;

/**
 * Created by John Bengtson & Christoffer Nilsson on 2017-04-20
 * based on the existing engines.
 */
public class ElasticsearchEngineEvaluator implements EngineEvaluator {
	private final TransformationParser parser;
	private final boolean noQuery;
    private Engine engine;
    
    private String indexName;
    private String typeName;
    
    private TransportClient client = null;

    private final static Logger logger = Logger.getLogger(ElasticsearchEngineEvaluator.class.getName());
    		
	public ElasticsearchEngineEvaluator(Engine engine, TransformationParser parser, Map<String, AtomValue<?>> params) {
		this.engine = engine;
		this.parser = parser;
		
		//This is taken from MongoDB
        if(!params.containsKey("index_name") || !params.containsKey("type_name"))
            throw new EvaluationException(
                    "Elasticsearch engine expects the following parameters on initialization: " +
                            engine.getArguments().stream().collect(Collectors.joining(", "))
            );
        
        this.indexName = params.get("index_name").getValue().toString();
        this.typeName = params.get("type_name").getValue().toString();
        //Added Boolean.parseBoolean("no_query") in order to successfully parse it.
        this.noQuery = (Boolean)params.getOrDefault(Boolean.parseBoolean("no_query"), new BooleanValue(false)).getValue();
	}
	
	@Override
	public InputPathParser getInputPathParser() {
		return new ElasticsearchInputPathParser(parser);
	}

	@Override
	public OutputPathParser getOutputPathParser() {
		return new ElasticsearchOutputPathParser(parser);
	}

	/**
	 * Uses the Hadoop/Spark API to get the input objects. Then uses the generic framework to do the evaluation.
	 */
	@Override
	public JavaRDD<ObjectValue> evaluate(Transformation transformation) {
		JavaSparkContext sc = NotaQL.SparkFactory.getSparkContext();
		final SparkTransformationEvaluator evaluator = new SparkTransformationEvaluator(transformation);
		
		//Added elasticsearch_host=localhost in the settings.config file.
		String elasticsearchHost = "http://" + NotaQL.prop.getProperty("elasticsearch_host", "localhost") + ":9300/";
        Configuration config = new Configuration();
        config.set("elastic.input.uri", elasticsearchHost + indexName + "." + typeName);
        
        JavaPairRDD<String, Map<String, Object>> elasticRDD = JavaEsSpark.esRDD(sc, indexName+"/"+typeName);
        // convert all objects in rdd to inner format
        JavaRDD<Value> values = elasticRDD.map(t -> ValueConverter.convertToObjectValue(t._1, t._2));
        
        // filter the ones not fulfilling the input filter
        final JavaRDD<Value> filtered = values.filter(v -> transformation.satisfiesInPredicate((ObjectValue) v));

        // process all input
        return evaluator.process(filtered);
	}
	
	
	@Override
	public void store(JavaRDD<ObjectValue> result) {
        logger.info("Storing result.");
        JavaRDD<Object> output = result.map(ValueConverter::convertFromNotaQL);
        
        JavaEsSpark.saveToEs(output, indexName+"/"+typeName, ImmutableMap.of("es.mapping.id", "mid", "es.mapping.exclude", "mid"));
        logger.info("Stored result.");
	}
	
    private void connect() throws ConnectException {
    	Settings settings = Settings.builder().build();
		try {
			client = new PreBuiltTransportClient(settings)
					.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(NotaQL.prop.getProperty("elasticsearch_host", "localhost")), 9300));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
    }

    private void disconnect() {
    	client.close();
    }

	@Override
	public ConstructorVData getConstructor(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FunctionVData getFunction(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
