package com.agileactors.strategy.behaviour;

public class HandClimb implements ClimbBehaviour {
  @Override
  public void climb() {
    System.out.println("I climb with my bare hands!");
  }
}
