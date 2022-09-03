package com.simplilearn.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface QuizRepo extends JpaRepository<Quiz, Integer> {
	
	@Query(value="select distinct quiz_id from quiz ",nativeQuery = true)
	List<String> getDistinctQuiz();
	
}