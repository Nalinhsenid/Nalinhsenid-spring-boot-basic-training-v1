package com.spring.springmongodocker.controller;

import com.spring.springmongodocker.model.Student;
import com.spring.springmongodocker.service.StudentListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentListController {
    @Autowired
    private StudentListService studentListService;
    @GetMapping("/studentslist")
    public List<Student> getStudents(){
        return studentListService.getStudents();
    }
    @GetMapping("/studentlist/{id}")
    public Student getStudent(@PathVariable int id){
        return  studentListService.getStudent(id);
    }

    @PostMapping("/savestudentlist")

    public void postStudent(@RequestBody Student student){
        studentListService.setStudent(student);

    }
}
