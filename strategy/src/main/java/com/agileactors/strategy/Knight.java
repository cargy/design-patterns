package com.agileactors.strategy;

public class Knight extends Character {
    public Knight() {
        this.attackMethod = new SwordAttack();
        this.climbBehaviour = new HandClimb();
    }

    @Override
    public void display() {
        System.out.println(":Knight:");
    }
}
