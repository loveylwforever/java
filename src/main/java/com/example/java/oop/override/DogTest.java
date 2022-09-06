package com.example.java.oop.override;

public class DogTest {
    public static void main(String[] args) {
        // 在编译阶段，只是检查参数的引用类型。
        // 在运行时，Java 虚拟机(JVM)指定对象的类型并且运行该对象的方法。
        new Dog().run();

        new Dog().run(100);
    }
}
