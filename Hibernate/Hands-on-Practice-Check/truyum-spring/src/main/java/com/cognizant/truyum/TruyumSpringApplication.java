package com.cognizant.truyum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.truyum.util.ConnectionHandler;
@SpringBootApplication
@ComponentScan({"com.cognizant.truyum.controller","com.cognizant.truyum.model","com.cognizant.truyum.dao","com.cognizant.truyum.util"})
public class TruyumSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruyumSpringApplication.class, args);
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConnectionHandler.class);
	}
}
