package com.spring.springmongodocker.service;

import com.spring.springmongodocker.dao.StudentRepository;
import com.spring.springmongodocker.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;


    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student getStudent(int id){
        return studentRepository.findById(id).get();
    }




    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
