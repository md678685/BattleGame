package io.github.md678685.java.battle.framework;

/* An interface for user interfaces (pun not intended). */
public interface IUserInterface {

    /* Retrieve the player's input. */
    String getInput();

    /* Send a custom message to the player. */
    void displayCustom(String message);

    /* Inform the player that the battle has begun. */
    void battleBegin(String opponent1Name, String opponent2name);

    /* Inform the player that an opponent was hurt. */
    void opponentHurt(String opponentName, int number);

}
