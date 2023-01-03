package com.spring.rabiulboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring")

public class RabiulbootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RabiulbootApplication.class, args);
	}

}
