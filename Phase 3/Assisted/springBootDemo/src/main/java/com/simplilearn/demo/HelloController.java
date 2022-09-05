package com.simplilearn.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/testme")
	@ResponseBody
	public String hello() {
		return "Hello ! Welcome to SpringBoot";
	}

}
