package utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.wnameless.json.flattener.JsonFlattener;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.util.Map;

public class Utility {

    static ObjectMapper mapper = null;

    JSONParser parser= new JSONParser();

    static {
        mapper = new ObjectMapper();
    }

    public Object jsonToObject(String jsonString) throws IOException
    {
       return mapper.readValue(jsonString,Object.class);
    }
    public String objectToJson(Object object) throws JsonProcessingException
    {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
    }

    public static Map<String,Object> jsonToMap(String jsonString)
    {
        return JsonFlattener.flattenAsMap(jsonString);
    }

}
