package com.example.java.operators;

// 条件运算符(也被称为三元运算符)
public class ConditionalOperators {
    // variable x = (expression) ? value if true : value if false
    public static void main(String[] args) {
        int a,b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println(b);

        b = (a == 10) ? 40 : 50;
        System.out.println(b);
    }
}
