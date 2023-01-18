package com.agileactors.strategy;

public class Queen extends Character {
  public Queen() {
    this.attackMethod = new SwordAttack();
    this.climbBehaviour = new HandClimb();
  }

  @Override
  public void display() {
    System.out.println(":Queen:");
  }
}
