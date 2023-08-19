package com.agileactors.strategy.character;

import com.agileactors.strategy.attack.AxeAttack;
import com.agileactors.strategy.behaviour.ClimbNot;

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
