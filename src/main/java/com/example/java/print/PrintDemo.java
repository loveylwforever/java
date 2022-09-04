package com.example.java.print;

import com.example.java.obj.Dog;

public class PrintDemo {
    public static void main(String[] args) {
        System.out.println("this is a simple print out");
        System.out.println("it can deal with escape character like \n or \t and something else");

        System.out.print("this is a print that");
        System.out.print(" don't change line\n");

        System.out.printf("this is a print that can format %s", "word");

    }
}
