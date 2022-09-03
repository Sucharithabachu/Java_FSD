package com.simplilearn.demo;

import javax.persistence.*;

@Entity
public class Questions {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int Id;
	private String Question;
	private String OptionA;
	private String OptionB;
	private String OptionC;
	private String OptionD;
	private String Answer;
	
	public Questions(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
		Question = question;
		OptionA = optionA;
		OptionB = optionB;
		OptionC = optionC;
		OptionD = optionD;
		Answer = answer;
	}
	
	public Questions() {}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOptionA() {
		return OptionA;
	}

	public void setOptionA(String optionA) {
		OptionA = optionA;
	}

	public String getOptionB() {
		return OptionB;
	}

	public void setOptionB(String optionB) {
		OptionB = optionB;
	}

	public String getOptionC() {
		return OptionC;
	}

	public void setOptionC(String optionC) {
		OptionC = optionC;
	}

	public String getOptionD() {
		return OptionD;
	}

	public void setOptionD(String optionD) {
		OptionD = optionD;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}
	
}