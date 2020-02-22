package com.merin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan
@SpringBootApplication
public class SubmissionFormApplication {
	
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) {
	 * 
	 * return application.sources(SubmissionFormApplication.class);
	 */


	public static void main(String[] args) {
		SpringApplication.run(SubmissionFormApplication.class, args);
	}

}
