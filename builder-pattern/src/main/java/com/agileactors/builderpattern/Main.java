package com.agileactors.builderpattern;

import java.util.UUID;

public class Main {

  public static void main(String[] args) {

    var builder = new User.Builder()
        .firstName("Alexis")
        .lastName("Panousis")
        .id(UUID.randomUUID());

    var director = new User.Director();

    director.makeBasicUser(builder);
    var basicUser = builder.build();
    System.out.println("Basic " + basicUser);

    director.makeIntermediateUser(builder);
    var intermediateUser = builder.build();
    System.out.println("Intermediate " + intermediateUser);

    director.makeAdminUser(builder);
    var adminUser = builder.build();
    System.out.println("Admin " + adminUser);

  }

}
