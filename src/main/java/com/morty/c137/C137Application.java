package com.morty.c137;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class C137Application {

	public static void main(String[] args) {
		SpringApplication.run(C137Application.class, args);
	}
}
