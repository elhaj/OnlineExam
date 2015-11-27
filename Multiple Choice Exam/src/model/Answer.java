package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer implements Serializable{

	private Integer answerID;

	private String answer;

	private Question question;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questionID", nullable = false)
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Column(nullable = false)
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Id
	@GeneratedValue
	@Column(nullable = false)
	public Integer getAnswerID() {
		return answerID;
	}
}
