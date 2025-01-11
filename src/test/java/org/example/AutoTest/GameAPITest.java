package org.example.AutoTest;

import org.apache.http.HttpStatus;
import org.assertj.core.api.Assertions;
import org.example.AutoTest.steps.PlayerSteps;
import org.example.character.Player;
import org.example.character.factory.PlayerFactory;
import org.junit.jupiter.api.Test;

public class GameAPITest {

    private static final String PLAYER_NAME = "NIKITA";
    private final PlayerSteps playerSteps = new PlayerSteps();

    @Test
    public void createPlayerTest(){

        PlayerFactory playerFactory = new PlayerFactory();
        Player player = playerFactory.getPlayer(PLAYER_NAME);

        Player createdPlayer = playerSteps
                .createPlayer(player)
                .statusCode(HttpStatus.SC_CREATED)
                .extract().as(Player.class);


        Assertions.assertThat(createdPlayer)
                .usingRecursiveAssertion()
                .as("Incorect Player with name `%s`".formatted(createdPlayer.getName()))
                .isEqualTo(player);

        /*Assertions.assertEquals(player, createdPlayer);*/
    }
}
