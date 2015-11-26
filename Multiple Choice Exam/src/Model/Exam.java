package Model;

import java.util.Date;

public class Exam {

	private int examID;
	private String title;
	private Date date;
	private int duration;
	private User professor;
	public User getProfessor() {
		return professor;
	}
	public void setProfessor(User professor) {
		this.professor = professor;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getExamID() {
		return examID;
	}
	
}
