package com.example.java.oop.interfaces;

/*  Java 接口
    ==================================================
    语法格式：
    [可见度] interface 接口名称 [extends 其他接口名称] {
        // 声明变量
        // 抽象方法
    }
    ==================================================
    在JAVA编程语言中是一个抽象类型，是抽象方法的集合。
    接口不能用于实例化对象。
    接口没有构造方法。
    接口中所有的方法必须是抽象方法，是隐式抽象的。
    接口不能包含成员变量，除了 static 和 final 变量。
    接口不是被类继承了，而是要被类实现。
    接口支持多继承。
    注：JDK 1.8 以后，接口里可以有静态方法和方法体了。
    注：JDK 1.8 以后，接口允许包含具体实现的方法，该方法称为"默认方法"，默认方法使用 default 关键字修饰。
 */
public interface InterfaceDemo {
    /*
        接口是隐式抽象的，当声明一个接口的时候，不必使用abstract关键字。
        接口中每一个方法也是隐式抽象的，声明时同样不需要abstract关键字。
        接口中的方法都是公有的。
     */
    // public abstract void test();
    public void test();
}

class DemoImpl implements InterfaceDemo {

    public void test() {
        System.out.println("demo implements here");
    }
}
