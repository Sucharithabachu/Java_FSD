package com.simplilearn.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class QuizController {
	@Autowired
	private QuizService service;
	
	///create new record
	@PostMapping("admin/quiz/")
	public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz u){
		Quiz quiz= service.addQuiz(u);
		if(quiz!=null)  
			return new ResponseEntity<Quiz>(quiz,HttpStatus.CREATED);
		else
			return new ResponseEntity<Quiz>(quiz, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//List of Users Or RETRIVE DATA 
	@GetMapping("admin/quiz/")
	public  List<Quiz> getAllQuiz(){
		return service.getAllQuiz();
	}
	
	@GetMapping("participant/getAllQuiz/")
	public List<String> getAllQuiz(String... args) throws Exception {	
		List<String> list = service.getDistinctQuiz();
		return list;	
	}

	@GetMapping("participant/{quiz_id}")
	public List<Object[]> getQuestions(@PathVariable int quiz_id)  {
		List<Object[]> list = service.getQuestions(quiz_id);
		return list;
	}
	
	
}