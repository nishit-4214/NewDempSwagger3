package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employees API", version = "2.0", description = "Employees Information"))
public class SwaggerSpringDemoApplication {
//https://www.javainuse.com/spring/boot_swagger3
	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringDemoApplication.class, args);
	}

}