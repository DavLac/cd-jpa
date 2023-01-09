package com.example.jpa;

import com.example.jpa.assignment.assignment03.Assignment03;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
		var assignment = new Assignment03();
	}

}
