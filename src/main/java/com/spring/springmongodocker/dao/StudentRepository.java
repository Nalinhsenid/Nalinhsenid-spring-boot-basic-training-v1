package com.spring.springmongodocker.dao;

import com.spring.springmongodocker.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {
}
