package com.agileactors.strategy.character;

import com.agileactors.strategy.attack.BareHandAttack;
import com.agileactors.strategy.behaviour.ClimbNot;

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
