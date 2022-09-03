package com.simplilearn.demo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
@Service
public class AdminService {

	@PersistenceContext
	EntityManager em  ;
	public List<Participant> getParticipants()
	{
		Query query = em.createQuery("select p from Participant p");
		return query.getResultList();
	}

}