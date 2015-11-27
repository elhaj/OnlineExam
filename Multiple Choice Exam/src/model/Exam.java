package model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Exam implements Serializable{

	private Integer examID;
	private String title;
	private Date date;
	private Integer duration;
	private User professor;
	private Set<Question> questions = new HashSet<Question>();
	private Set<Result> results = new HashSet<Result>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID", nullable = false)
	public User getProfessor() {
		return professor;
	}

	public void setProfessor(User professor) {
		this.professor = professor;
	}

	@Column(nullable = false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	Calendar cal = Calendar.getInstance(); // locale-specific
//	cal.setTime(dateObject);
//	cal.set(Calendar.HOUR_OF_DAY, 0);
//	cal.set(Calendar.MINUTE, 0);
//	cal.set(Calendar.SECOND, 0);
//	cal.set(Calendar.MILLISECOND, 0);
//	long time = cal.getTimeInMillis();
	
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(nullable = false)
	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Id
	@GeneratedValue
	@Column(nullable = false)
	public Integer getExamID() {
		return examID;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, mappedBy = "exam")
	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, mappedBy = "exam")
	public Set<Result> getResults() {
		return results;
	}

	public void setResults(Set<Result> results) {
		this.results = results;
	}

}
