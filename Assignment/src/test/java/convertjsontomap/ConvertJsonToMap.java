
package convertjsontomap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.wnameless.json.flattener.JsonFlattener;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import utility.Utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class ConvertJsonToMap {
    public static void main(String[]args) throws IOException, ParseException {
        File file= new File("G:\\SELF CLONED PROJECT\\JSON EXERCISE\\Assignment\\src\\test\\java\\demo.json");
        FileReader reader= new FileReader(file);

        JSONParser parser= new JSONParser();

        Object obj=parser.parse(reader);

        JSONObject jsonObject=(JSONObject)obj;

        String jsonString=new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);

        // Here Utility class is using for convert into Map
        /*Map<String,Object> map=Utility.jsonToMap(jsonString);

        for(Map.Entry<String,Object>entry:map.entrySet())
        {
            System.out.println(entry.getKey() + " --> "+ entry.getValue());
        }*/

        // We can use following instead of calling Utility class for convert into map

        Map<String,Object>jsonMap=JsonFlattener.flattenAsMap(jsonString);
        for(Map.Entry<String,Object>entry:jsonMap.entrySet())
        {
            System.out.println(entry.getKey() + " --> "+ entry.getValue());
        }

    }
}
