package org.example;

public class User {
    String name1;
    String email1;


    public User(String name) {
        name1 = name;
    }

    public User(String name, String email) {
        name1 = name;
        email1 = email;
    }

    public void basicMethod1() {
    System.out.println("My name is: " + name1 + " My email is: " + email1);
    }



    }