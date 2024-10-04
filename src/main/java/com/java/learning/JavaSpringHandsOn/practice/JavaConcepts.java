package com.java.learning.JavaSpringHandsOn.practice;

import com.java.learning.JavaSpringHandsOn.pojo.Student;

public class JavaConcepts {
    public static void main(String[] args) {
        Student s1 = Student.builder().id(1).name("akshit").age(27).city("dl").build();
        Student s2 = Student.builder().id(1).name("akshit").age(27).city("dl").build();
        Student s3 = Student.builder().id(1).name("akshit").age(26).city("dl").build();
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}
