package com.example.java.basic.operators;

// 检查对象类型的操作符
public class InstanceofOperator {
    // ( Object reference variable ) instanceof  (class/interface type)
    public static void main(String[] args) {
        String name = "Jamie";
        boolean result = name instanceof String;// 由于 name 是 String 类型，所以返回真
        System.out.println(result);
    }
}
