package com.ecom.ecomspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ecom.ecomspringboot.repository")
public class EcomspringbootApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EcomspringbootApplication.class, args);
	}
}
