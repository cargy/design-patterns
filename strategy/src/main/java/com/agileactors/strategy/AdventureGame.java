package com.agileactors.strategy;

import com.agileactors.strategy.behaviour.HandClimb;
import com.agileactors.strategy.character.*;
import com.agileactors.strategy.character.Character;

import java.util.Arrays;
import java.util.List;

public class AdventureGame {
  public static void main(String[] args) {
    System.out.println(":.. Adventure Game ..:");

    Character king = new King();
    Character queen = new Queen();
    Character knight = new Knight();
    Character dwarf = new Dwarf();
    Character troll = new Troll();

    List<Character> characters = Arrays.asList(
        king,
        queen,
        knight,
        dwarf,
        troll
    );

    characters.forEach(character -> {
      character.display();
      character.walk();
      character.fight();
      character.climb();
    });

    dwarf.setClimbBehaviour(new HandClimb());
    dwarf.display();
    dwarf.climb();

    System.out.println("...Game Over...");
  }
}