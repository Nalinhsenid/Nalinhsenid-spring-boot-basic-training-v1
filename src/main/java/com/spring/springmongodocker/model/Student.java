package com.spring.springmongodocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Integer id;

    private String name;
    private String dateOfBirth;
    private double average;


}
