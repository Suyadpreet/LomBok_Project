package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LomBokProjectApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(LomBokProjectApplication.class, args);
		Userclass u = new Userclass(10,"jtc",87546);
		System.out.println(u.getPhn());
		
	}

}
