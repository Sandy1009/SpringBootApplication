package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectSpringApplication.class, args);

		System.out.println("Hello World..........");

		SchoolPojo sp = context.getBean(SchoolPojo.class);
		sp.display();

		/*SchoolPojo sp1 = context.getBean(SchoolPojo.class);
		sp1.display();*/

	}

}
