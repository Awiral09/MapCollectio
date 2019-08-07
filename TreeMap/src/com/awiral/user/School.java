package com.awiral.user;

import com.awiral.controller.Student;

import java.util.TreeSet;

public class School {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        // System.out.println(students.size());

        students.add(new Student(101, "S1", "C1", 1000));
        students.add(new Student(101, "S1", "Core Java", 1000));
        System.out.println(students);
    }

}
