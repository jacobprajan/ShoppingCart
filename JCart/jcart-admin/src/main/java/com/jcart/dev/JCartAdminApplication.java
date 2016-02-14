package com.jcart.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration 
// and @ComponentScan with their default attributes

@SpringBootApplication
public class JCartAdminApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(JCartAdminApplication.class, args);
	}
}
