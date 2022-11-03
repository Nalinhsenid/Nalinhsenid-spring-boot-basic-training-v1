package com.spring.springmongodocker.controller;

import com.spring.springmongodocker.model.Student;
import com.spring.springmongodocker.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/student")

    public String saveStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Added student with id :" +student.getId();

    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Delete student with id :" +id;

    }
}
