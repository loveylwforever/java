package com.example.java.oop.extend;

public class ShapeDemo {
    public static void main(String[] args) {
        new Circle().draw();
        new Square().draw();
        new Triangle().draw();
    }
}

class Shape {
    void draw() {}
}

class Circle extends Shape {
    void draw() {
        System.out.println("Call Circle.draw()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Call Square.draw()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Call Triangle.draw()");
    }
}
