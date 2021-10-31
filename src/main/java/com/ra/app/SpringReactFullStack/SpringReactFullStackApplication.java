package com.ra.app.SpringReactFullStack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ra.app.SpringReactFullStack.*")
public class SpringReactFullStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactFullStackApplication.class, args);
	}

}
