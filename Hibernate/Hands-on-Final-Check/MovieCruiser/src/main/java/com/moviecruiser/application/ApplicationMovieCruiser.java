package com.moviecruiser.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.moviecruiser.controller", "com.moviecruiser.dao","com.moviecruiser.model","com.moviecruiser.service"})
public class ApplicationMovieCruiser {

	public static void main(String[] args)
	{
		SpringApplication.run(ApplicationMovieCruiser.class,args);
		
	}
}
