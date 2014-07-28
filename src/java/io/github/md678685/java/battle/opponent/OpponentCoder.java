package io.github.md678685.java.battle.opponent;
/* A basic opponent to demonstrate how opponents work. */
public class OpponentCoder implements IOpponent {

    private static String attackMemoryEdit = "Memory Edit";
    private static int maxHealth = 100;
    private int currentHealth = maxHealth;

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
}
