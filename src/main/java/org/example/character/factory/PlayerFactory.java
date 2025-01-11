package org.example.character.factory;


import org.example.character.Player;

public class PlayerFactory {
    public Player getPlayer (String playerName) {

        Player player = new Player();

        switch ("1" /*playerClass*/) {
            case ("1"):
                player.setHp(50);
                player.setIntelligence(15);
                player.setDexterity(30);
                player.setWisdom(5);
                player.setStrength(10);
                break;
            case ("2") :
                player.setHp(101);
                player.setIntelligence(10);
                player.setDexterity(10);
                player.setWisdom(5);
                player.setStrength(30);
                break;
            case ("3") :
                player.setHp(25);
                player.setIntelligence(30);
                player.setDexterity(10);
                player.setWisdom(30);
                player.setStrength(5);
                break;
        }
        //Stat
        //Формула для хп считающая карму нужна для мотивации игрока играть так как он хочет от зла или добра со своими последствиями
        player.setHp((player.getHp() - ( player.getDarkness()/5 )) + ( player.getHoliness()/5 ));
        // Формула для защиты будет комплексной исходя из ловкости и доспеха
        player.setDefence(player.getDefence() + player.getDexterity()/5 );
        // Формула для POWER или урона по простому будет считаься из силы и оружия (айтема)
        player.setPower(10 + player.getStrength());
        player.setName(playerName);


        //Карма
        player.setDarkness(1);
        player.setHoliness(1);
        return player;

    }
}
