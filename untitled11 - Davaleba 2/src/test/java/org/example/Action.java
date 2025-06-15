package org.example;

import net.datafaker.Faker;

public class Action {
    public static void main(String[] args) {
     Faker faker = new Faker();
     String name2 = faker.name().firstName();
     String email2 = faker.internet().emailAddress();

// პირველი მხოლოდ სახელს გადასცემს. მეორე სახელთან ერთად მეილსაც გადასცემს.
//   User u = new User(name2);
     User u = new User(name2,email2);
     u.basicMethod1();



    }
}
