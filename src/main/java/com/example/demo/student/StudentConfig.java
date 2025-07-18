package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 5),
                    25
            );

            Student alex = new Student(
                    "Alex",
                    "alex.carlson@gmail.com",
                    LocalDate.of(2001, Month.DECEMBER, 14),
                    24
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
