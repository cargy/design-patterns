package com.agileactors.strategy;

public class Dwarf extends Character {

    @Override
    public void fight() {
        System.out.println("Swing Axe!");
    }

    @Override
    public void display() {
        System.out.println(":Dwarf:");
    }

}
