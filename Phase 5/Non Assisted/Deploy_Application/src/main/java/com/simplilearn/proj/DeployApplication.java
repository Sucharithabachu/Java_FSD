package com.simplilearn.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.proj")
public class DeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployApplication.class, args);
	}

}
