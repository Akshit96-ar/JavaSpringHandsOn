package com.java.learning.JavaSpringHandsOn.service;

import com.java.learning.JavaSpringHandsOn.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class StudentService {
    public Student createStudent(Student student) {
        student.setId(new Random().nextInt(100));
        return student;
    }
}
