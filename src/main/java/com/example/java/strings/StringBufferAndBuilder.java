package com.example.java.strings;


public class StringBufferAndBuilder {
    public static void main(String[] args) {
        // 线程不安全
        StringBuilder sb = new StringBuilder(10);
        sb.append("JamieGao");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);

        // 线程安全
        StringBuffer sBuffer = new StringBuffer("我的名字是：");
        sBuffer.append("Jamie");
        sBuffer.append(" ");
        sBuffer.append("Gao");
        System.out.println(sBuffer);
    }
}
