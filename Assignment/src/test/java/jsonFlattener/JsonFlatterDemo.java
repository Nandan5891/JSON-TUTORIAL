package jsonFlattener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.wnameless.json.flattener.JsonFlattener;
import com.github.wnameless.json.unflattener.JsonUnflattener;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class JsonFlatterDemo {
    public static void main(String[]args) throws IOException, ParseException {
        File file= new File("G:\\SELF CLONED PROJECT\\JSON EXERCISE\\Assignment\\src\\test\\java\\demo.json");
        FileReader reader= new FileReader(file);
        JSONParser parser= new JSONParser();

        Object obj= parser.parse(reader);

        JSONObject jsonObject= (JSONObject)obj;

        System.out.println("*********Flattened JSON************");

        String flattenedJson= JsonFlattener.flatten(jsonObject.toString());

        System.out.println(flattenedJson);
        System.out.println("====================================================");

        // Flatten As map
        Map<String,Object> flattenedJsonMap=JsonFlattener.flattenAsMap(jsonObject.toString());
        System.out.println("*********After ConvertingINto Map Data********");
        //Traversing the Map
        for(Map.Entry<String,Object>entry:flattenedJsonMap.entrySet())
        {
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
        System.out.println("=====================================================");

        // Unflatten it back to original Json
        System.out.println("*****Unflatted Json**********");
        String nestedJson= JsonUnflattener.unflatten(flattenedJson);
        System.out.println(nestedJson);
        System.out.println("=====================================================");
        System.out.println("*******Displaying Data in JSON Format**********");
        String jsonString= new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);

        System.out.println(jsonString);
    }

}
