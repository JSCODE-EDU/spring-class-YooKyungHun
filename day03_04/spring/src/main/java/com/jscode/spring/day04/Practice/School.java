package com.jscode.spring.day04.Practice;

public class School {

    public static void main(String[] args) {
        Student student = new Student("Yoo", 10);

        student.print();
        System.out.printf(student.getName());
    }

}
