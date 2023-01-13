package com.agileactors.strategy;

public class Troll extends Character{

    @Override
    public void display() {
        System.out.println(":Troll:");
    }

    @Override
    public void fight() {
        System.out.println("Bare hands attack!");
    }
}
