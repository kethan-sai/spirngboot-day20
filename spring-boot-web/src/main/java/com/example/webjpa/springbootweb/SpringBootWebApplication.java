package com.example.webjpa.springbootweb;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {
		final SpringApplication app = new SpringApplication(SpringBootWebApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.servlet.context-path", "/springboot"));
		app.run(args);
	}

}
