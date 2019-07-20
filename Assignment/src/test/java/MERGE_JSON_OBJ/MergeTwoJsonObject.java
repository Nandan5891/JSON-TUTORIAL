package MERGE_JSON_OBJ;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

public class MergeTwoJsonObject {
    public static void main(String[]args) throws JsonProcessingException {
        JSONObject json1= new JSONObject();
        JSONObject json2= new JSONObject();

        json1.put("Name","RamNandan");
        json1.put("Education","MCA");
        json1.put("Ocuupation","Engineer");

        json2.put("Village","Raghopur");
        json2.put("District","Darbhanga");
        json2.put("State","Bihar");

        System.out.println("json1:"+json1);
        System.out.println("========================");
        System.out.println("Json2: "+json2);
        System.out.println("==========================");
        json2.putAll(json1);

        System.out.println("After Merging");

        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(json2));
    }





    }

