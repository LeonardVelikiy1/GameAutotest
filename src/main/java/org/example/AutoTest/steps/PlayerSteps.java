package org.example.AutoTest.steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.example.character.Player;

import javax.swing.text.AbstractDocument;

import static io.restassured.RestAssured.given;

public class PlayerSteps {
    public ValidatableResponse createPlayer(Player player) {
        RestAssured.baseURI = "http://89.169.15.204:8080";

       return given()
                .contentType(ContentType.JSON)
                .body(player)
                .when()
                .post("/player")
                .then();


    }
}
