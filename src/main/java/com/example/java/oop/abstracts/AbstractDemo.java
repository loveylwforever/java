package com.example.java.oop.abstracts;

public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mod Hashimoto", "Lamberta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
