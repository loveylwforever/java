package com.example.java.basic.operators;

// 逻辑运算符
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));

        int c = 5;//定义一个变量；
        // 当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了。
        boolean d = (c<4)&&(c++<10);
        System.out.println("使用短路逻辑运算符的结果为"+d);
        System.out.println("a的结果为"+c);
    }
}
