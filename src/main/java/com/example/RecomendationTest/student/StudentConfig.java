package com.example.RecomendationTest.student;

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
            Student mariam = new Student(1L, "Mariam", "m@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));

            Student alex = new Student("Alex", "a@gmail.com",
                    LocalDate.of(1994, Month.DECEMBER, 2));

            repository.saveAll(List.of(mariam, alex));
        };

    }
}
