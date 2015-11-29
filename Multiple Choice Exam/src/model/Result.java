package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.sun.istack.internal.Nullable;

@Entity
public class Result implements Serializable , EntityBean{
	
	private Integer resultID;
	private Integer score;
	private User student;
	private Exam exam;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userID", nullable=false)
	public User getStudent() {
		return student;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="examID", nullable=false)
	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Id
	@GeneratedValue
	public Integer getResultID() {
		return resultID;
	}

	@Column(nullable = false)
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
}
