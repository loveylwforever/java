package com.example.java.oop.extend;

// Java 继承测试
public class AnimalTest {
    public static void main(String[] args) {
        // 动物 Animal 的共性抽象成父类，子类 Cat & Dog 继承，就有了父类的属性和方法，包括构造方法
        new Dog("小白", 10).eat();
        new Dog("小白", 10).old();
        new Cat("小黑", 3).eat();
        new Cat("小黑", 3).old();
    }
}
