package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class EchoTest {
    @Test
    void ShouldAnswer(){
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body()
                ;


    }

}
