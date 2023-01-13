package com.agileactors.strategy;

public class ClimbNot implements ClimbBehaviour {
    @Override
    public void climb() {
        System.out.println("I cannot climb :(");
    }
}
