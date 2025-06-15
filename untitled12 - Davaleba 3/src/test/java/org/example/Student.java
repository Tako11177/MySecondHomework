package org.example;

public class Student {

    private String name;
    private int age;
    private int grade;


    //constructor
    public Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }


    //Setter
    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setGrade(int newGrade){
        if(newGrade >= 0 && newGrade <= 100){
            grade = newGrade;
        }

    }






}
