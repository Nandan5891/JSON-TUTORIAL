package readjsondatafromfile;

import com.eclipsesource.json.JsonObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadJsonData {
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("G:\\SELF CLONED PROJECT\\JSON EXERCISE\\Assignment\\src\\test\\java\\second.json");
        FileReader reader = new FileReader(file);

        JSONParser parser = new JSONParser();

        Object obj = parser.parse(reader);
        JSONObject jsonObject = (JSONObject) obj;

        String name = (String) jsonObject.get("Name");
        String author=(String) jsonObject.get("Author");
        System.out.println("Name is:  "+name);
        System.out.println("Author is: "+author);

        System.out.println("======================================");

        JSONArray jsonArray = (JSONArray)jsonObject.get("Company List");

        System.out.println("List of Company are following");

        Iterator<String>itr=jsonArray.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
