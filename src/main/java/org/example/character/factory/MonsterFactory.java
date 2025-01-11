package org.example.character.factory;

import org.example.character.Difficulty;
import org.example.character.Monster;

import java.util.Random;

public class MonsterFactory {
    public Monster createEasyMonster(Difficulty difficulty) {
        Monster spider = new Monster();

        spider.setType("spider");
        spider.setHp(10);
        spider.setPower(1);
        spider.setDefence(1);

        return spider;
    }

    public Monster createMediumMonster(Difficulty difficulty){
        Monster imp = new Monster();

        imp.setType("imp");
        imp.setHp(50);
        imp.setPower(5);
        imp.setDefence(2);

        return imp;
    }
    public Monster createHardMonster(Difficulty difficulty){
        Monster demon = new Monster();

        Random random = new Random();

        demon.setType("DeweloperThisShit");
        int demonHp = random.nextInt(99) + 1;

        demon.setHp(demonHp);

        if(demonHp < 50){
            demon.setPower(10);
        } else if(demonHp > 50){
            demon.setPower(20);
        } else if(demonHp > 90){
            demon.setPower(30);
        } else {
            throw new RuntimeException("Cant create hardMonster = " + demonHp);
        }

        demon.setDefence(3);

        return demon;
    }
}
