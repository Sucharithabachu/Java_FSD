package com.simplilearn.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
	
	@Autowired
	private QuizRepo repo;
	
	//add method or CREATE RECORD
	public Quiz addQuiz(Quiz u) {
		return repo.save(u);
	}
	
	
	//List user Method
	public List<Quiz> getAllQuiz(){
		return repo.findAll();
	} 
	
	public List<String> getDistinctQuiz()
	{
		return repo.getDistinctQuiz();
	}
	
	@PersistenceContext
	EntityManager em  ;
	public List<Object[]> getQuestions(int quiz_id)
	{
		Query query = em.createQuery("select q.Id,q.Question,q.OptionA,q.OptionB,q.OptionC,q.OptionD from Questions q"
				+ " where q.Id in (select z.questionId from Quiz z where z.quizId = "+quiz_id+")");
		return query.getResultList();
	}
}