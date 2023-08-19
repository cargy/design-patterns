package com.agileactors.strategy.attack;

public class SwordAttack implements AttackMethod {
  @Override
  public void attack() {
    System.out.println("Swing sword!");
  }
}
