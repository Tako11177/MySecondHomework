package org.example;

import net.datafaker.Faker;

public class Action {
    public static void main(String[] args) {

        Student s = new Student("Tako",32, 80);
        System.out.println("Name is: " + s.getName());
        System.out.println("Age is: " + s.getAge());
        System.out.println("Grade is: " + s.getGrade());


        Faker faker = new Faker();
        String fName = faker.name().firstName();
        int nAge = faker.number().numberBetween(18,100);
        int nGrade = faker.number().numberBetween(0,100);


        s.setName(fName);
        s.setAge(nAge);
        s.setGrade(nGrade);
        System.out.println("New Name is: " + s.getName());
        System.out.println("New Age is: " + s.getAge());
        System.out.println("New Grade is: " + s.getGrade());








    }
}
