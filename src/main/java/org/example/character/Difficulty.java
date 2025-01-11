package org.example.character;

public enum Difficulty {
    EASY(1),
    MEDIUM(2),
    HARD(3);

    private int intValue;

    Difficulty(int intValue) {
        this.intValue = intValue;
    }

    public static Difficulty fromInt(int intValue){
        for (Difficulty difficulty : Difficulty.values()) {
                if(intValue == difficulty.intValue) return difficulty;
            }
            throw new RuntimeException("Unknown difficulty inValue = " + intValue);

        }

    }
