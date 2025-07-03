package com.example.demo; // This should match your project's base package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This is the main annotation for a Spring Boot application
public class DemoApplication {

	public static void main(String[] args) {
		// This is the entry point of the Java application
		// SpringApplication.run() starts the Spring Boot application
		SpringApplication.run(DemoApplication.class, args);
	}

}