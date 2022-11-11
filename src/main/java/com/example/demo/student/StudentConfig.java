package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    //@Bean - runs when the program is started
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            StudentModal avishya = new StudentModal(
                    "avishya",
                    "avisha.t@gmail.com",
                    26,
                    LocalDate.of(1990, Month.SEPTEMBER, 6)
            );

            StudentModal manoj = new StudentModal(
                    "manoj",
                    "manoj@gmail.com",
                    28,
                    LocalDate.of(1986, Month.SEPTEMBER, 6)
            );
            repository.saveAll(List.of(avishya, manoj));
        };

    }
}
