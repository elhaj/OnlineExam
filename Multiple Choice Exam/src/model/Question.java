package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question implements Serializable{

	private Integer questionID;
	private String question;
	private Integer correctAnswerID;
	private Exam exam;
	private Set<Answer> answers = new HashSet<Answer>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="examID", nullable=false)
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	@Column(nullable=false)
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	@Column(nullable=false)
	public Integer getCorrectAnswerID() {
		return correctAnswerID;
	}
	public void setCorrectAnswerID(Integer correctAnswerID) {
		this.correctAnswerID = correctAnswerID;
	}
	@Id
	@GeneratedValue
	@Column(nullable=false)
	public Integer getQuestionID() {
		return questionID;
	}
	@OneToMany(fetch=FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy="question")
	public Set<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
}
