package com.java.learning.JavaSpringHandsOn.controllers;

import com.java.learning.JavaSpringHandsOn.pojo.Student;
import com.java.learning.JavaSpringHandsOn.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/v1")
public class StudentController {

    private static final String template = "Hey, %s!";

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/studentByName/{name}")
    public ResponseEntity<String> getStudentByName(@PathVariable String name) {
        return ResponseEntity.ok(String.format(template, name));
    }

    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.createStudent(student));
    }
}
