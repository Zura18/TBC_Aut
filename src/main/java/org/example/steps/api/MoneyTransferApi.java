package org.example.steps.api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class MoneyTransferApi {
    public static Response getMoneyTransfer(){
        return given()
                .baseUri("https://apigw.tbcbank.ge")
                .basePath("/api/v1/moneyTransfer/systems")
                .queryParam("locale", "ka-GE")                .contentType(ContentType.JSON)
                .when()
                .get();
    }
}
