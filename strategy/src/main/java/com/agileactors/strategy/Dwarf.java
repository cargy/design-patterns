package com.agileactors.strategy;

public class Dwarf extends Character {

  public Dwarf() {
    this.attackMethod = new AxeAttack();
    this.climbBehaviour = new ClimbNot();
  }

  @Override
  public void display() {
    System.out.println(":Dwarf:");
  }

}
