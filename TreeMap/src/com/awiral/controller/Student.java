package com.awiral.controller;

public class Student implements Comparable<Student> {
    private int sno;
    private String name;
    private String course;
    private double fee;

    public Student(int sno, String name, String course, double fee) {
        this.sno = sno;
        this.name = name;
        this.course = course;
        this.fee = fee;

    }

    @Override
    public String toString() {
        return "\nStudent (" + " " + sno
                + " " + name
                + " " + course
                + " " + fee;
    }

    @Override
    public int compareTo(Student student) {
        int courseDiff = this.course.compareTo(student.course);
        System.out.println("courseDifference = " + courseDiff);
        if (courseDiff == 0) {
            //  System.out.println(this.sno-student.sno);
            return this.sno - student.sno;
            //return student.sno - this.sno;

        }
        return courseDiff;
    }
}
