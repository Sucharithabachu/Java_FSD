package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

	@Autowired
	private AnswerService service;
	
	@PostMapping("/participant/answer")
	public ResponseEntity<Answer> saveAnswer(@RequestBody Answer a)
	{
		Answer answer = service.addAnswer(a);
		if(answer!=null)  
			return new ResponseEntity<Answer>(answer,HttpStatus.CREATED);
		else
			return new ResponseEntity<Answer>(answer, HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	
	@GetMapping("/result/{participant_id}/{quiz_id}")
	public ResponseEntity<Object> getResult(@PathVariable int participant_id, @PathVariable int quiz_id)  {
		List<Object[]> list = service.getResult(participant_id,quiz_id);
		if(list!=null)
			return new ResponseEntity<Object>(list,HttpStatus.FOUND);
		else
			return new ResponseEntity<Object>(list,HttpStatus.NOT_FOUND);
	}
	
}