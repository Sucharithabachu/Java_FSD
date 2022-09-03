package com.simplilearn.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepo repo;
	
	public Answer addAnswer(Answer u) {
		return repo.save(u);
	}
	
	@PersistenceContext
	EntityManager em  ;
	public List<Object[]> getResult(int participant_id, int quiz_id)
	{
		Query query = em.createQuery("select a.QuestionId, q.Answer , a.Answer , case when (q.Answer = a.Answer) then 'Correct' else 'Wrong' end "
				+ "from Answer a, Questions q  where (a.ParticipantId="+participant_id+" and a.QuizId="+quiz_id+") and a.QuestionId = q.Id");
		return query.getResultList();
	}	
}