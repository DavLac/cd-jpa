package com.example.jpa;

import com.example.jpa.solution.assignment03.Assignment03;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
        var app = new Assignment03();
        app.testPersistNewObject();
    }

}
