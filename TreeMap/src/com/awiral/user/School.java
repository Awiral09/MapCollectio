package com.awiral.user;

import com.awiral.controller.Student;

import java.util.TreeSet;

public class School {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        // System.out.println(students.size());

        students.add(new Student(101, "S1", "Core Java", 1000));
        students.add(new Student(102, "S1", "Angular", 1000));
        students.add(new Student(99, "S1", "Advance Java", 1000));
        students.add(new Student(472, "S1", "Advance Java", 1000));
        students.add(new Student(55, "S1", "Core Java", 1000));
        students.add(new Student(55, "S1", "Core Java", 1000));

     /* students.add(new Student(101, "S1", "Advance Java", 1000));
        students.add(new Student(101, "S3", "Advance Java", 1000));
        students.add(new Student(101,  "S2", "Advance Java", 1000));
        students.add(new Student(101, "S5", "Advance Java", 1000));
        students.add(new Student(104,  "S4", "Advance Java", 1000));*/

        System.out.println(students);
    }

}
