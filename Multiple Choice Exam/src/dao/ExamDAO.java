package dao;

import model.Exam;

public interface ExamDAO {

	public void getQuestions(Exam exam);
	public void getResults(Exam exam);
}
