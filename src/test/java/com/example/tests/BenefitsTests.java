package com.example.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class BenefitsTests {
    @Test
    public void testViewBenefits() {
        Response response = RestAssured.given()
            .header("Authorization", "Bearer " + config.Config.AUTH_TOKEN)
            .get(config.Config.BASE_URL + "/benefits");

        response.then().statusCode(200)
                .body("benefits", notNullValue());
    }

    @Test
    public void testUpdatePreferences() {
        Response response = RestAssured.given()
            .header("Authorization", "Bearer " + config.Config.AUTH_TOKEN)
            .contentType("application/json")
            .body("{\"preference\": \"new preference\"}")
            .put(config.Config.BASE_URL + "/benefits/preferences");

        response.then().statusCode(200);
    }
}
