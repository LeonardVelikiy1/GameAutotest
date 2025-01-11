package org.example.character;

import java.util.Objects;

public abstract class Fighter extends Character {
    protected int hp;
    protected int power;
    protected int defence;
    protected String type;
    protected int strength;
    protected int dexterity;
    protected int wisdom;
    protected int darkness;
    protected int holiness;

    public int getStrength() {return strength;}

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getDarkness() {
        return darkness;
    }

    public void setDarkness(int darkness) {
        this.darkness = darkness;
    }

    public int getHoliness() {
        return holiness;
    }

    public void setHoliness(int holiness) {
        this.holiness = holiness;
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return hp == fighter.hp && power == fighter.power && defence == fighter.defence && strength == fighter.strength && dexterity == fighter.dexterity && wisdom == fighter.wisdom && darkness == fighter.darkness && holiness == fighter.holiness && Objects.equals(type, fighter.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, power, defence, type, strength, dexterity, wisdom, darkness, holiness);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "defence=" + defence +
                ", hp=" + hp +
                ", power=" + power +
                ", type=" + type +
                '}';
    }
}
