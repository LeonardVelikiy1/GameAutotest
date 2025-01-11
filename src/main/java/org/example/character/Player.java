package org.example.character;

import java.util.Objects;

public class Player extends Fighter {
    private int intelligence;

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return intelligence == player.intelligence;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(intelligence);
    }

    @Override
    public String toString() {
        return "Player{" +
                "intelligence=" + intelligence +
                ", hp=" + hp +
                ", power=" + power +
                ", defence=" + defence +
                ", name='" + name + '\'' +
                '}';
    }
}
