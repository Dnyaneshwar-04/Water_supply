package com.dk.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dk.spring.repository.WaterRepository;

@SpringBootApplication
public class Application{

	@Autowired
	WaterRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
}
