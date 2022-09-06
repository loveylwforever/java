package com.example.java.oop.extend;

public class Animal {
    private String name;
    private int age;

    public Animal(String myName, int myAge){
        name = myName;
        age = myAge;
    }

    public void eat(){
        System.out.println(name + "在吃饭");
    }

    public void old(){
        System.out.println("今年" + age + "岁了");
    }
}
