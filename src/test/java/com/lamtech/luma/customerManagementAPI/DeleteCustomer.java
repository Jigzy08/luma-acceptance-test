package com.lamtech.luma.customerManagementAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteCustomer {

    @Test
    public void deleteCustomer(){

        RestAssured.baseURI = "https://reqres.in/api"; //Specify endpoint
        Response response = null;
        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .delete("/users/2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(" Server Response is :" + response.asString());
        assertEquals(204, response.getStatusCode());
        //System.out.println(response.asString().contains("Janet"));

    }

}
