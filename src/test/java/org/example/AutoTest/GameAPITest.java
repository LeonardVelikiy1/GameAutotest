package org.example.AutoTest;

import org.apache.http.HttpStatus;
import org.example.AutoTest.steps.PlayerSteps;
import org.example.character.Player;
import org.example.character.factory.PlayerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameAPITest {
    private PlayerSteps playerSteps = new PlayerSteps();
    @Test
    public void createPlayerTest(){

        PlayerFactory playerFactory = new PlayerFactory();
        Player player = playerFactory.getPlayer("NIKITA");

        Player createPlayer =
        playerSteps
                .createPlayer(player)
                .statusCode(HttpStatus.SC_CREATED)
                .extract().as(Player.class);

        Assertions.assertEquals(player, createPlayer);
    }
}
