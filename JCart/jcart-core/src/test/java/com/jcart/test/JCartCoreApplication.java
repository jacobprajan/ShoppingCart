package com.jcart.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// To test the jcart-core module functionality
//  Main entry point class in jcart-core


//@SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration 
//and @ComponentScan with their default attributes
@SpringBootApplication
public class JCartCoreApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(JCartCoreApplication.class, args);
	}
}
