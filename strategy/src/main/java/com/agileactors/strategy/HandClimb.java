package com.agileactors.strategy;

public class HandClimb implements ClimbBehaviour {
  @Override
  public void climb() {
    System.out.println("I climb with my bare hands!");
  }
}
