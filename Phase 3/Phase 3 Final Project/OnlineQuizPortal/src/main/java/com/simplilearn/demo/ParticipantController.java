package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/participant")
public class ParticipantController {
	
	@Autowired
	private ParticipantService service;
	
	@PostMapping("/register")
	public ResponseEntity<Participant> register(@RequestBody Participant u){
		Participant user= service.registerUser(u);
		if(user!=null)  
			return new ResponseEntity<Participant>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<Participant>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}