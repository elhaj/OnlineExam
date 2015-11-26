package Model;

public class Result {
	private User student;
	private Exam exam;
	private int score;
	
	public User getStudent() {
		return student;
	}
	public void setStudent(User student) {
		this.student = student;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
