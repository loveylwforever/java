package com.example.java.strings;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Jamie";              // String 直接创建
        String s2 = "Jamie";              // String 直接创建
        String s3 = s1;                    // 相同引用
        String s4 = new String("Jamie");   // String 对象创建
        String s5 = new String("Jamie");   // String 对象创建
        System.out.println(s1 == s2);
        System.out.println(s3 == s1);
        System.out.println(s3 == s2);
        System.out.println(s4 == s1);
        System.out.println(s4 == s5);

        System.out.println("s1 的长度是：" + s1.length());

        System.out.println("字符串拼接：" + s1.concat(" Gao"));

        System.out.println("字符串截取：" + s1.substring(2));
    }
}
