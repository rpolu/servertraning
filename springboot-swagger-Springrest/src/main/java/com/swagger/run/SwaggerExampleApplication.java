package com.swagger.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SwaggerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerExampleApplication.class, args);
	}
}
