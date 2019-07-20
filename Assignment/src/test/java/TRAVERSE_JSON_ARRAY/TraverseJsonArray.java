package TRAVERSE_JSON_ARRAY;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TraverseJsonArray {
    public static void main(String[] args) throws IOException, ParseException {

        File file = new File("G:\\SELF CLONED PROJECT\\JSON EXERCISE\\Assignment\\src\\test\\java\\demo.json");
        FileReader reader = new FileReader(file);
        JSONParser parser = new JSONParser();

        Object object = parser.parse(reader);
        JSONObject jsonObject = (JSONObject) object;

        JSONArray jsonArray = (JSONArray) jsonObject.get("Company Services");
        int length = jsonArray.size();

       /* for(int i=0;i<length;++i)
        {
            System.out.println(jsonArray.get(i));
        }*/

        for (Object oo : jsonArray) {
            System.out.println(oo);

        }

    }
}
