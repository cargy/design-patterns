package com.agileactors.strategy;

public class Troll extends Character {

  public Troll() {
    this.attackMethod = new BareHandAttack();
    this.climbBehaviour = new ClimbNot();
  }

  @Override
  public void display() {
    System.out.println(":Troll:");
  }

}
