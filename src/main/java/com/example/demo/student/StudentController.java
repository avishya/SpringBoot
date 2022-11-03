package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/")
public class StudentController {

//    @GetMapping(path="student")
//    public List<StudentModal> returnStudent(){
//        return List.of(new StudentModal(123,"avishya1","avisha.t@gmail.com",26,
//                LocalDate.of(1990, Month.SEPTEMBER,6)));
//    }

//    https://blog.marcnuri.com/field-injection-is-not-recommended -- dependency injection 3 types
    private final StudentService studentService;    //reference to StudentService

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;   //without @Autowired, it will work if this.studentService = new StudentService()
    }

    @GetMapping(path="student")
    public List<StudentModal> getStudents(){
       return studentService.getStudents();
    }

}
