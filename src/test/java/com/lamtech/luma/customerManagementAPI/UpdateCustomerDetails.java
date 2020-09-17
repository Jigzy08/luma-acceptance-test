package com.lamtech.luma.customerManagementAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpdateCustomerDetails {

    @Test
    public void createCustomer(){

        RestAssured.baseURI = "https://reqres.in/api"; //Specify endpoint
        Response response = null;
        String requestBody = "{\n" +
                "  \"name\": \"Joe\",\n" +
                "  \"job\": \"Finance\"\n" +
                "}";


        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .put("/users/613");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(" Server Response is :" + response.asString());
        assertEquals(200, response.getStatusCode());
        System.out.println(response.asString().contains("Finance"));

    }

}
