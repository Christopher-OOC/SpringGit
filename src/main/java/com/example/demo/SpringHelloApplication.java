package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SpringHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloApplication.class, args);
	}
	
	@Bean
	ObjectMapper getObjejhtguyhctMapper() {
		return new ObjectMapper();
	}

}
