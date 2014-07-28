package io.github.md678685.java.battle;

public class Battle {

    /* Holds the first opponent. Temporarily a String, will be an Opponent when implemented. */
    protected String opponent1;
    /* Holds the second opponent. Temporarily a String, will be an Opponent when implemented. */
    protected String opponent2;

    public Battle(String opponent01, String opponent02) {
        // Set global opponents to provided ones
        opponent1 = opponent01;
        opponent2 = opponent02;
    }

    public String getOpponent1() {
        return opponent1;
    }

    public String getOpponent2() {
        return opponent2;
    }

}
