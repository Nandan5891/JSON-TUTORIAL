package restassuredfile;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class PostCall {

    public static void main(String[]args)
    {
        RestAssured.baseURI="https://reqres.in/api";
        RequestSpecification httpRequest=RestAssured.given();

        JSONObject requestParams=new JSONObject();

        requestParams.put("name","RamNandan");
        requestParams.put("job","Engineer");

        httpRequest.header("Content-Type","application/json");
        httpRequest.body(requestParams.toJSONString()); // Attach json data to the request

        Response response=httpRequest.request(Method.POST,"/users");

        String responseBody=response.getBody().asString();

        System.out.println("Response Body is: "+responseBody);

        int statuscode=response.getStatusCode();

        System.out.println("Status code is: "+statuscode);


    }
}
