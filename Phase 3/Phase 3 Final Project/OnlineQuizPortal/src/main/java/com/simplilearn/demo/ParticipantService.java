package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {

	@Autowired
	private ParticipantRepo repo;
	
	public Participant registerUser(Participant u)
	{
		return repo.save(u);
	}
}