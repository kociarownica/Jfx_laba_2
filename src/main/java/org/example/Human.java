package org.example;

public class Human {

    String name;
    int age;

    Human(String name, int age){
        this.name = name;
        this.age = age;
    };

    String getName(){return this.name;};
    int getAge(){return this.age;};
}