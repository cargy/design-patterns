package com.agileactors.strategy.character;

import com.agileactors.strategy.behaviour.HandClimb;
import com.agileactors.strategy.attack.SwordAttack;

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
