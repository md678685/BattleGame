package io.github.md678685.java.battle;

import io.github.md678685.java.battle.opponent.IOpponent;

public class Battle {

    /* Holds the first opponent. */
    protected IOpponent opponent1;
    /* Holds the second opponent. */
    protected IOpponent opponent2;

    public Battle(IOpponent opponent01, IOpponent opponent02) {
        // Set global opponents to provided ones
        opponent1 = opponent01;
        opponent2 = opponent02;
    }

    /* Returns the first opponent. */
    public IOpponent getOpponent1() {
        return opponent1;
    }
    /* Returns the second opponent. */
    public IOpponent getOpponent2() {
        return opponent2;
    }

}
