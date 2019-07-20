package JSON_READ_WRITE;

import org.json.simple.parser.JSONParser;
import utility.Utility;

import java.io.IOException;

public class RunnerClass {
    static Utility utility= new Utility();
    public static void main(String[]args) throws IOException {
        Address address= new Address();
        address.setVillage("Raghopur");
        address.setDistrict("Darbhanga");
        address.setState("Bihar");

        TestData testData= new TestData();
        testData.setName("RamNandan");
        testData.setEdu("MCA");
        testData.setOccupation("Engineer");
        testData.setAddress(address);

        //Convert Object to JSonString
        System.out.println("After Converting Object to JsonString");
        String jsonString= utility.objectToJson(testData);
        System.out.println(jsonString);

        //Convert JsonString to Object
        System.out.println("After Converting jsonString to Object");
        Object obj=utility.jsonToObject(jsonString);
        System.out.println(obj);

        JSONParser parser= new JSONParser();



    }
}
