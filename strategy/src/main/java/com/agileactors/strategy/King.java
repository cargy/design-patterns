package com.agileactors.strategy;

public class King extends Character {

  public King() {
    this.attackMethod = new SwordAttack();
    this.climbBehaviour = new HandClimb();
  }

  @Override
  public void display() {
    System.out.println(":King:");
  }
}
