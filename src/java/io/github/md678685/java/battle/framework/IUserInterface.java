package io.github.md678685.java.battle.framework;

/* An interface for user interfaces (pun not intended). */
public interface IUserInterface {

    /* Retrieve the player's input. */
    String getInput();

    /* Send a custom message to the player. */
    void displayCustom(String message);

    /* Inform the player that the battle has begun. */
    void battleBegin(IOpponent opponent1, IOpponent opponent2);

    /* Inform the player that an opponent was hurt. */
    void opponentHurt(IOpponent opponent, int amount);

    /* Inform the player that an opponent lost. */
    void opponentlost(IOpponent loserOpponent, IOpponent winnerOpponent);

}
