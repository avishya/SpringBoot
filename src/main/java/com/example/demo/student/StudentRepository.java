package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//class name having Repository is naming convention for anything that accessing database
//This is Data Access Layer
@Repository
public interface StudentRepository
        extends JpaRepository<StudentModal, Long> {
}
