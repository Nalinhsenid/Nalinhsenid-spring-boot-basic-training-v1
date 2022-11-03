package com.spring.springmongodocker.service;

import com.spring.springmongodocker.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentListService {
    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1,"Nalin","1996.01.01",50.2),
            new Student(2,"Nalin2","1997.01.01",60.2),
            new Student(3,"Nalin3","1998.01.01",70.2)
    ));


    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(Integer id){
        return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void setStudent(Student student) {
        students.add(student) ;
    }
}
