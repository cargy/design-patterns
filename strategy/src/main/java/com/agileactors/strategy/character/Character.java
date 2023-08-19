package com.agileactors.strategy.character;

import com.agileactors.strategy.attack.AttackMethod;
import com.agileactors.strategy.behaviour.ClimbBehaviour;

public abstract class Character {

  AttackMethod attackMethod;
  ClimbBehaviour climbBehaviour;

  public void fight() {
    attackMethod.attack();
  }

  public void climb() {
    climbBehaviour.climb();
  }

  public void walk() {
    System.out.println("Walk! All characters can walk");
  }

  public void setClimbBehaviour(ClimbBehaviour climbBehaviour) {
    this.climbBehaviour = climbBehaviour;
  }

  public abstract void display();
}
