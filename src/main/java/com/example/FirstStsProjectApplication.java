package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstStsProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FirstStsProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("First STS Project..!!\n Welcome To GIT");
		System.out.println("Hey.. Good Morning..");
		
	}
}
