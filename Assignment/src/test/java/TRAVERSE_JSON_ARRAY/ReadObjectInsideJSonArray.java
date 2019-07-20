package TRAVERSE_JSON_ARRAY;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadObjectInsideJSonArray {
    public static void main(String[] args) throws IOException, ParseException {

        File file = new File("G:\\SELF CLONED PROJECT\\JSON EXERCISE\\Assignment\\src\\test\\java\\nested_object.json");

        FileReader reader = new FileReader(file);
        JSONParser parser = new JSONParser();
        Object object = parser.parse(reader);
        JSONObject jsonObject = (JSONObject) object;
        JSONArray jsonArray = (JSONArray) jsonObject.get("products");

        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject slide = (JSONObject) iterator.next();
            String summary = (String) slide.get("summary");
            double averageRating = (double) slide.get("averageRating");

            JSONObject stockobj1 = (JSONObject) slide.get("stock");
            JSONObject stockLevelStatus = (JSONObject) stockobj1.get("stockLevelStatus");
            String code = (String) stockLevelStatus.get("code");
            String codeLowerCase = (String) stockLevelStatus.get("codeLowerCase");

            System.out.println("Summary:-->" + summary);
            System.out.println("Average Rating:-->" + averageRating);
            System.out.println("Code:-->" + code);
            System.out.println("Code Lower Case:-->" + codeLowerCase);

            //Nested Array
            System.out.println("Nested Array");
            JSONArray imageJsonArray = (JSONArray) slide.get("images");

            for (Object obj : imageJsonArray) {
                System.out.println(obj);
            }

        }

    }
}
