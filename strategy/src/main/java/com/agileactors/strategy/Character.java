package com.agileactors.strategy;

public abstract class Character {

    public void fight() {
        System.out.println("Swing sword!");
    }

    public void walk() {
        System.out.println("Walk! All characters can walk");
    }

    public abstract void display();
}
