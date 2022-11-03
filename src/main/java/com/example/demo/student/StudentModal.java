package com.example.demo.student;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StudentModal {
    private int id;
    private String name;
    private String email;
    private int age;
    private LocalDate dob;


    public StudentModal() {
    }

    public StudentModal(int id, String name, String email, int age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }


}
