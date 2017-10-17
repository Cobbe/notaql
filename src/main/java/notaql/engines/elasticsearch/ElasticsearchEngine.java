package notaql.engines.elasticsearch;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.auto.service.AutoService;

import notaql.datamodel.AtomValue;
import notaql.engines.Engine;
import notaql.engines.EngineEvaluator;
import notaql.parser.TransformationParser;

/**
 * Created by John Bengtson and Christoffer Nilsson on 2017-04-20
 * The extension is based on the JSONEngine and the MongoDBEngine.
 * The JSONEngine seems to be based on the MongoDBEngine.
 */
@AutoService(Engine.class)
public class ElasticsearchEngine implements Engine {

	/**
	 * Added a generated serialVersionUID.
	 */
	private static final long serialVersionUID = 103167395661014481L;

	@Override
	public EngineEvaluator createEvaluator(TransformationParser parser, Map<String, AtomValue<?>> params) {
		return new ElasticsearchEngineEvaluator(this, parser, params);
	}

	@Override
	public String getEngineName() {
		return "elasticsearch";
	}

	@Override
	public List<String> getArguments() {
		return Arrays.asList("index_name", "type_name", "no_query");
	}
	
    @Override
    public String toString() {
        return this.getEngineName();
    }

}
