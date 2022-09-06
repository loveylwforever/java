package com.example.java.oop.override;

public class Dog extends Animal{
    // 重写
    public void run(){
        System.out.println("重写了，不要奔跑，动物！");

        System.out.println("使用 super 关键字来调用父类的方法！");
        super.run();
    }

    /*  重载
        被重载的方法必须改变参数列表(参数个数或类型不一样)；
        被重载的方法可以改变返回类型；
        被重载的方法可以改变访问修饰符；
        被重载的方法可以声明新的或更广的检查异常；
        方法能够在同一个类中或者在一个子类中被重载。
        无法以返回值类型作为重载函数的区分标准。
     */
    public void run(int speed){
        System.out.println("重载了，动物目前奔跑时速：" + speed + "公里/小时");
    }
}
