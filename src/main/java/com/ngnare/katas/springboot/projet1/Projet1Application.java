package com.ngnare.katas.springboot.projet1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Projet1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projet1Application.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {

		};
	}
}
