package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//@Component Component or Service. Both are same.
//Service layer is responsible for business logic
@Service    //this annotation tells that it is a spring bean and can be instantiated
public class StudentService {

//    public List<StudentModal> getStudents(){
//        return List.of(new StudentModal(
//                123L,
//                "avishya1",
//                "avisha.t@gmail.com",
//                26,
//                LocalDate.of(1990, Month.SEPTEMBER,6)));
//    }

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentModal> getStudents(){
        return studentRepository.findAll();
    }
}
