package io.github.md678685.java.battle.game.opponent;

import io.github.md678685.java.battle.framework.IOpponent;

/* A basic opponent to demonstrate how opponents work. */
public class OpponentCoder implements IOpponent {

    private static String attackMemoryEdit = "Memory Edit";
    private static int maxHealth = 100;
    private int currentHealth = maxHealth;
    private static int count = 0;
    private String name;

    public OpponentCoder() {
        count += 1;
        name = String.format("Coder %s", Integer.toString(count));
    }

    @Override
    public String getNextAttack() {
        return attackMemoryEdit;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

    @Override
    public int getMaxHealth() {
        return maxHealth;
    }

    @Override
    public void attack(int amount) {
        currentHealth -= amount;
    }

    @Override
    public void heal(int amount) {
        currentHealth += amount;
    }

    public String getName() {
        return name;
    }
}
