package notaql.engines.elasticsearch.datamodel;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mongodb.BasicDBObject;

import notaql.datamodel.*;
import notaql.model.EvaluationException;

/**
 * Created by John Bengtson and Christoffer Nilsson on 2017-05-04
 * Currently, this is based on parts from both the 
 * JSON ValueConverter and the MongoDB ValueConverter.
 *
 * This class has not been entirely verified, we recommend it to be reviewed and carefully tested.
 */

/**
 * Converts Elasticsearch's format to our internal format and vice versa.
 *
 * Supported types are:
 * - Null
 * - String
 * - Date
 * - Number
 * - Boolean
 * - List
 * - JSONObject
 * - JSONArray
 */

public class ValueConverter {
	
	public static Value convertToNotaQL(Object o) {
		// Atom values
        if(o == null)
            return new NullValue();
        if(o.equals(JSONObject.NULL))
        	return new NullValue();
        if(o instanceof String)
            return new StringValue((String) o);
        if(o instanceof Number)
            return new NumberValue((Number) o);
        if(o instanceof Boolean)
            return new BooleanValue((Boolean) o);
        if(o instanceof Date) // From MongoDB
        	return new DateValue((Date) o);

        // complex values
        
        if(o instanceof List) { // From MongoDB
            final List<?> list = (List<?>) o;
            final ListValue result = new ListValue();
            for (Object item : list) {
                result.add(convertToNotaQL(item));
            }
            return result;
        }
        
        if(o instanceof JSONArray) {
            final JSONArray array = (JSONArray) o;
            final ListValue result = new ListValue();
            IntStream.range(0, array.length())
                    .forEach(i -> result.add(convertToNotaQL(array.get(i))));
            return result;
        }

        if(o instanceof JSONObject) {
            final JSONObject jsonObject = (JSONObject) o;
            final ObjectValue result = new ObjectValue();

            final Iterator<String> keyIterator = jsonObject.keys();
            while(keyIterator.hasNext()) {
                final String key = keyIterator.next();
                final Step<String> step = new Step<>(key);
                final Value value = convertToNotaQL(jsonObject.get(key));

                result.put(step, value);
            }
            return result;
        }

        throw new EvaluationException("Unsupported type read: " + o.getClass() + ": " + o.toString());
	}
	
	public static Object convertFromNotaQL(Value o) {
		// Atom values
        if(o instanceof NullValue)
            return null;
        if(o instanceof StringValue)
        	return ((StringValue) o).getValue();
        if(o instanceof NumberValue)
            return ((NumberValue) o).getValue();
        if(o instanceof BooleanValue)
            return ((BooleanValue) o).getValue();
        if(o instanceof SplitAtomValue<?>)
            return ((SplitAtomValue<?>)o).getValue();
        if(o instanceof DateValue) // From MongoDB
            return ((DateValue) o).getValue();

        // if unknown: fall back to strings
        if(o instanceof AtomValue<?>) {
            return ((AtomValue<?>) o).getValue().toString();
        }
        
        // complex values (Not sure if it is used)
        if(o instanceof ListValue) {
            return new JSONArray(
                    ((ListValue)o).stream()
                            .map(ValueConverter::convertFromNotaQL)
                            .collect(Collectors.toList())
            );
        }

        if(o instanceof ObjectValue) {
            Map<String, Object> elasticObject = new HashMap<String, Object>();
            for (Map.Entry<Step<String>, Value> entry : ((ObjectValue) o).toMap().entrySet()) {
            	elasticObject.put(entry.getKey().getStep(), convertFromNotaQL(entry.getValue()));
            }
            return elasticObject;
        }

        throw new EvaluationException("Unsupported type written: " + o.getClass() + ": " + o.toString());
	}
	
	public static ObjectValue convertToObjectValue(String id, Map<String, Object> fields){
    	final ObjectValue objectValue = new ObjectValue();
    	objectValue.put(new Step<>("_id"), new StringValue(id));
    	for(Map.Entry<String, Object> field : fields.entrySet()){
    		if(field != null){
    			objectValue.put(new Step<>(field.getKey()), convertToNotaQL(field.getValue()));
    		}
    	}
    	return objectValue;
    }

}
