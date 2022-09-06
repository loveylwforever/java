package com.example.java.oop.abstracts;

/*  Java 抽象研究
    abstract用来修饰类和方法，表示抽象类和抽象方法。
    作用是将子类的公共属性和不能确认的方法提取到抽象类，确认的方法也可以写到抽象类，子类继承抽象类，简化代码操作。
    是模板设计模式。
    只要类中还有未实现的抽象成员(抽象方法)，那么这个类就是一个抽象类
    抽象方法必须被继承者实现，非抽象方法，继承者可以不复写
 */

public abstract class AbstractTest {
    abstract void eat();
}

class inheritAbstract extends AbstractTest{

    @Override
    void eat() {

    }
}
