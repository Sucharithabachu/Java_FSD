package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

	@Autowired
	private QuestionsRepo repo;
	
	public Questions addQuestion(Questions q)
	{
		return repo.save(q);
	}
	
	public List<Questions> getAllQuestions(){
		return repo.findAll();
	}
	
	public Questions getQuestionById(int id) {
		if(repo.findById(id).isPresent()) 
			return repo.findById(id).get();
		else 
			return null;		
	}
	
	public  Questions updateQuestion(Questions ques, int id) {		
		if(repo.findById(id).isPresent())
		{
			Questions old= repo.findById(id).get();
			old.setId(ques.getId());
			old.setQuestion(ques.getQuestion());
			old.setOptionA(ques.getOptionA());
			old.setOptionB(ques.getOptionB());
			old.setOptionC(ques.getOptionC());
			old.setOptionD(ques.getOptionD());
			old.setAnswer(ques.getAnswer());
			return repo.save(old);
		}
		else
			return null; 
	}
	
	public boolean deleteQuestion(int id) {
		
		if(repo.findById(id).isPresent())
		{
			repo.deleteById(id);
			return true;
		}
		else
			return false;
	}
	
	
}