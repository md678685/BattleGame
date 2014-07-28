package io.github.md678685.java.battle.game;

import io.github.md678685.java.battle.framework.Battle;
import io.github.md678685.java.battle.game.opponent.OpponentCoder;

/* A starter class for the game. */
public class Start {

    public static void main(String args[]) {
        Battle battle = new Battle(new OpponentCoder(), new OpponentCoder());
    }

}
