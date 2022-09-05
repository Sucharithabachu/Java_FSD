package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlller {
	
	@GetMapping("/testme")
	public String hello() {
		return "Hello ! Welcome to SpringBoot";
	}

}