package com.jscode.spring.day04.Practice;

public class Student {

    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("possible or not?");
    }
}
