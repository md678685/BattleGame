package io.github.md678685.java.battle.game;

import io.github.md678685.java.battle.framework.IOpponent;
import io.github.md678685.java.battle.framework.IUserInterface;

import java.io.Console;

/* A java.io.Console based user interface. */
public class UserInterface implements IUserInterface {

    private Console console;
    private String input;

    public UserInterface() {
        console = System.console();
    }

    @Override
    public String getInput() {
        input = console.readLine("What do you want to do?");
        return input;
    }

    @Override
    public void displayCustom(String message) {
        console.printf(message);
    }

    @Override
    public void battleBegin(IOpponent opponent1, IOpponent opponent2) {
        console.printf("%s encounters %s and a battle begins!", opponent1.getName(), opponent2.getName());
    }

    @Override
    public void opponentHurt(IOpponent opponent, int amount) {
        console.printf("%s loses %s health points!", opponent.getName(), amount);
    }

    @Override
    public void opponentlost(IOpponent loserOpponent, IOpponent winnerOpponent) {
        console.printf("%s defeats %s in the battle!", winnerOpponent.getName(), loserOpponent.getName());
    }

    
}
