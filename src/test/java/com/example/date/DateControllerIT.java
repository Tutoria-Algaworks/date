package com.example.date;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DateControllerIT {

    @LocalServerPort
    private int port;

    @BeforeEach
    public void setup() {
        RestAssured.port = port;
    }

    @Test
    public void givenADateInBrazilianFormatWhenPostThenReturnNoContent() {
        given()
                .body("{\"date\": \"26/02/1988\"}")
                .contentType(ContentType.JSON)
                .when().post("/date")
                .then().statusCode(HttpStatus.NO_CONTENT.value());
    }

    @Test
    public void givenADateInAmericanFormatWhenPostThenReturnBadRequest() {
        given()
                .body("{\"date\": \"1988/02/26\"}")
                .contentType(ContentType.JSON)
                .when().post("/date")
                .then().statusCode(HttpStatus.BAD_REQUEST.value());
    }
}
