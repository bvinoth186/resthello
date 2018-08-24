package com.resthello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = { "classpath:application.properties" })
@SpringBootApplication
public class ResthelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResthelloApplication.class, args);
		
		System.out.println("Environment value :" + System.getenv("spring.data.mongodb.uri"));
		
		
      
	}
}
