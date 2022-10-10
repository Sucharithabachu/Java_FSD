package com.simplilearn.proj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from springboot app";
	}

}