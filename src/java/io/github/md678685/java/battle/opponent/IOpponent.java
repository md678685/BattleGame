package io.github.md678685.java.battle.opponent;

public interface IOpponent {

    /* Retrieve the next attack. */
    String getNextAttack();

    /* Retrieve the current health, in case it isn't public. */
    int getCurrentHealth();

    /* Retrieve the maximum health, in case it isn't public. */
    int getMaxHealth();

    /* Process the attack. Temporarily int until attacks are implemented. */
    void attack(int attack);

    /* Apply the healing. Temporarily int until effects are implemented. */
    void heal(int amount);

}
