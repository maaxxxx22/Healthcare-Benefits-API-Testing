package utils;

import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;

public class ApiUtils {
    // Method to create a RequestSpecification with default headers
    public static RequestSpecification createRequestWithAuth(String authToken) {
        return RestAssured.given()
                .header("Authorization", "Bearer " + authToken)
                .contentType("application/json");
    }

    // Method to create a basic RequestSpecification
    public static RequestSpecification createBasicRequest() {
        return RestAssured.given().contentType("application/json");
    }
}
