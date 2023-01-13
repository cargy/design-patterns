package com.agileactors.strategy;

public class AxeAttack implements AttackMethod {
    @Override
    public void attack() {
        System.out.println("Swing Axe!");
    }
}
