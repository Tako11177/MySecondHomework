package org.example;

import net.datafaker.Faker;

public class CAR {
    public static void main(String[] args) {
       printInfo();

    }

    public static void printInfo() {
    Faker faker = new Faker();
    String make = faker.vehicle().make();
    String model = faker.vehicle().model();
    int year = faker.number().numberBetween(1990,2025);
        System.out.println("Brand: " + make + "; Model: " + model + "; Year: " + year);

    }
}
