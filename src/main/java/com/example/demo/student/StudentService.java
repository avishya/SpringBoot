package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//@Component Component or Service. Both are same.
//Service layer is responsible for business logic
@Service    //this annotation tells that it is a spring bean and can be instantiated
public class StudentService {

    public List<StudentModal> getStudents(){
        return List.of(new StudentModal(
                123,
                "avishya1",
                "avisha.t@gmail.com",
                26,
                LocalDate.of(1990, Month.SEPTEMBER,6)));
    }
}
