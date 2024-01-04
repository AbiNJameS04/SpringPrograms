package com.ust.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostgresRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresRestApplication.class, args);
		System.out.println("running");
	}

}
