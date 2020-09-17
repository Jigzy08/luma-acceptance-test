package com.lamtech.luma.customerManagementAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreateCustomer {

    @Test
    public void createCustomer(){

        RestAssured.baseURI = "https://reqres.in/api"; //Specify endpoint
        Response response = null;
        String requestBody = "{\n" +
                "  \"name\": \"Joe\",\n" +
                "  \"job\": \"leader\"\n" +
                "}";


        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .post("/users");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(" Server Response is :" + response.asString());
        assertEquals(201, response.getStatusCode());
        System.out.println(response.asString().contains("Joe"));

    }


}
