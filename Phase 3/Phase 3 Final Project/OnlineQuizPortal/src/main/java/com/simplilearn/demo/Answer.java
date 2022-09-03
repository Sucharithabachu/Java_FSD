package com.simplilearn.demo;

import javax.persistence.*;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name = "ParticipantId")
	private int ParticipantId;
	private int QuizId;
	private int QuestionId;
	private String Answer;
	
	public Answer() { }

	public Answer(int participantId, int quizId, int questionId, String answer) {
		
		ParticipantId = participantId;
		QuizId = quizId;
		QuestionId = questionId;
		Answer = answer;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getParticipantId() {
		return ParticipantId;
	}

	public void setParticipantId(int participantId) {
		ParticipantId = participantId;
	}

	public int getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public int getQuizId() {
		return QuizId;
	}

	public void setQuizId(int quizId) {
		QuizId = quizId;
	}
}