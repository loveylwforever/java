package com.example.java.oop.extend;

public class AnotherAnimalTest {
    public static void main(String[] args) {
        show(new AnotherCat());  // 以 Cat 对象调用 show 方法
        show(new AnotherDog());  // 以 Dog 对象调用 show 方法

        AnotherAnimal a = new AnotherCat();  // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
        AnotherCat c = (AnotherCat)a;        // 向下转型
        c.work();        // 调用的是 Cat 的 work
    }

    public static void show(AnotherAnimal a)  {
        a.eat();
        // 类型判断
        if (a instanceof AnotherCat)  {  // 猫做的事情
            AnotherCat c = (AnotherCat)a;
            c.work();
        } else if (a instanceof AnotherDog) { // 狗做的事情
            AnotherDog c = (AnotherDog)a;
            c.work();
        }
    }
}

abstract class AnotherAnimal {
    abstract void eat();
}

class AnotherCat extends AnotherAnimal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class AnotherDog extends AnotherAnimal {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}