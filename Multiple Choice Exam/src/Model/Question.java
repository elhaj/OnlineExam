package Model;

public class Question {

	private int questionID;
	private String question;
	private int correctAnswerID;
	private Exam exam;
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getCorrectAnswerID() {
		return correctAnswerID;
	}
	public void setCorrectAnswerID(int correctAnswerID) {
		this.correctAnswerID = correctAnswerID;
	}
	public int getQuestionID() {
		return questionID;
	}
}
