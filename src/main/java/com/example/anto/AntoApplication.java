package com.example.anto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.anto.repository")
public class AntoApplication {

	public static void main(String[] args) {
	SpringApplication.run(AntoApplication.class, args);
		System.out.println(1234);
	}

}
