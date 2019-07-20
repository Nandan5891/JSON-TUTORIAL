package restassuredfile;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetCall {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/2");

        String responseBody = response.getBody().asString();

        System.out.println("Response Body is: " + responseBody);

        int statusCode = response.getStatusCode();

        System.out.println("statusCode is: " + statusCode);

        String statuLine = response.getStatusLine();

        System.out.println("StatusLine is: " + statuLine);

    }
}
