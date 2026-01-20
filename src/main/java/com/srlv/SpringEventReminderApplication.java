package com.srlv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringEventReminderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventReminderApplication.class, args);
	}

	@Bean
	CommandLineRunner run(Test test) {
		return args -> {
			test.display();
		};
	}
}