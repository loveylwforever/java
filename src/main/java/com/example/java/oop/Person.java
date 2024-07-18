package com.example.java.oop;

public class Person {

    private String name;
    private int gender;
    private int age;
    private String call;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender == 0 ? "男人" : "女人";
    }

    public String getCall() {
        return gender ==0 ? "他" : "她";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public void work() {
        if (18 <= age && age <= 50) {
            System.out.println(name + " 是一个 " + getGender() + " 并且 " + getCall() + " 工作起来很努力!");
        } else {
            System.out.println(name + " 是一个 " + getGender() + " 并且 " + getCall() + " 年级大了已经不适合工作了!");
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(60);
        person.setGender(0);

        person.work();
    }
}
