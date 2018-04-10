package com.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(MySpringBootApplication.class, args);
		
	}
	
	public String sayHello(){
		
		return "Hello This is a Sample Spring Boot Application";
	}

}
