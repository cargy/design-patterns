package com.agileactors.strategy.attack;

public class BareHandAttack implements AttackMethod {
  @Override
  public void attack() {
    System.out.println("Grabbing with bare hands!");
  }
}
