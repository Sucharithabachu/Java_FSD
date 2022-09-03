package com.simplilearn.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/question")
public class QuestionController {

	@Autowired
	private QuestionService service;
	
	@PostMapping("/")
	public ResponseEntity<Questions> addQuestion(@RequestBody Questions q){
		Questions ques= service.addQuestion(q);
		if(ques!=null)  
			return new ResponseEntity<Questions>(ques,HttpStatus.CREATED);
		else
			return new ResponseEntity<Questions>(ques, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/")
	public  List<Questions> getAllQuestions(){
		return service.getAllQuestions();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Questions> getQuestionById(@PathVariable int id){
		Questions ques= service.getQuestionById(id);		  
		  if(ques!=null)
			  return new ResponseEntity<Questions>(ques,HttpStatus.FOUND);
		  else
			  return new  ResponseEntity<Questions>(ques,HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateUser(@RequestBody Questions ques,@PathVariable int id){
		Questions data= service.updateQuestion(ques, id);		
		if(data!=null)
			return new ResponseEntity<Object>(data,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("Question is Not Available",HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteQuestion(@PathVariable  int id ){
		
		if(service.deleteQuestion(id))
			return new ResponseEntity<Object>("Question Deleted", HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No question Found",HttpStatus.NOT_FOUND);
	}	
}