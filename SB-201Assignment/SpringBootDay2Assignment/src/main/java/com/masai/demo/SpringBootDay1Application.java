package com.masai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDay1Application {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(SpringBootDay1Application.class, args);
	
	A obj=ac.getBean("a",A.class);
	obj.printA("Rakib");
	
	}

}
