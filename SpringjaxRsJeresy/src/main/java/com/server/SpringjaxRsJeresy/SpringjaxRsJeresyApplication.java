package com.server.SpringjaxRsJeresy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.*")
public class SpringjaxRsJeresyApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringjaxRsJeresyApplication.class, args);
	}

}

