package com.example.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class AuthenticationTests {
    @Test
    public void testLogin() {
        Response response = RestAssured.given()
            .contentType("application/json")
            .body("{\"username\": \"user\", \"password\": \"pass\"}")
            .post(config.Config.BASE_URL + "/auth/login");

        response.then().statusCode(200)
                .body("token", notNullValue());
    }

    @Test
    public void testLogout() {
        Response response = RestAssured.given()
            .header("Authorization", "Bearer " + config.Config.AUTH_TOKEN)
            .post(config.Config.BASE_URL + "/auth/logout");

        response.then().statusCode(200);
    }
}
