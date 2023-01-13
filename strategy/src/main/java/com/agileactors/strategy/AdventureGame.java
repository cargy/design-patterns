package com.agileactors.strategy;

import java.util.Arrays;
import java.util.List;

public class AdventureGame {
    public static void main(String[] args) {
        System.out.println(":.. Adventure Game ..:");

        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();

        List<Character> characters = Arrays.asList(
                king,
                queen,
                knight);

        characters.forEach(character -> {
            character.display();
            character.walk();
            character.fight();
        });

        System.out.println("...Game Over...");
    }
}