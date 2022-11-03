package com.example.demo;

import com.example.demo.student.StudentModal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String returnString(){
		return "Hello Avishya";
	}

	@GetMapping(value="manoj")
	public String returnDifferntString(){
		return "Hello Manoj";
	}

	@GetMapping(path="jsonMessage")
	public List<String> returnJsonMessage(){
		return List.of("Hello","Manvik");
	}

	@GetMapping(path="student")
	public List<StudentModal> returnStudent(){
		return List.of(new StudentModal(123L,"avishya","avisha.t@gmail.com",26,
				LocalDate.of(1990, Month.SEPTEMBER,6)));
	}

	@GetMapping(path="student/{name}/{age}")
	public List<StudentModal> returnStudent1(@PathVariable String name,@PathVariable int age){
		return List.of(new StudentModal(123L,name,"avisha.t@gmail.com",age,
				LocalDate.of(1990, Month.SEPTEMBER,6)));
	}

}
