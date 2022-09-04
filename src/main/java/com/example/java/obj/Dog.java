package com.example.java.obj;

// 面向对象编程
public class Dog {
    // 成员变量
    String name;
    // 成员变量
    int age;
    // 类变量
    static String color="red";

    // 方法
    void eat(){}
    // 方法
    void run(){
        // 局部变量
        String speed;
    }
    // 方法
    static void bark(){
        // 静态变量无法修改值
        color = "green";
        System.out.println("if the dog sees color " + color + " ,it will bark");
    }

    // 默认无参构造方法
    public Dog(){}

    // 构造器仅有一个 name 参数
    public Dog(String name){
        System.out.println("the dog's name is:" + name);
    }

    public static void main(String[] args) {
        new Dog("snoopy");
        bark();
    }
}
