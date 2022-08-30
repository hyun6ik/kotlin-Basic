package Lec21.java;

import Lec21.kotlin.Student;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "hyun6ik";
        student.setBirthDate(LocalDate.of(2000,1,1));

        System.out.println(student.name);
        System.out.println(student.getBirthDate());
        System.out.println(student.getAge());
    }
}
