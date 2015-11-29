package service;

import java.util.Set;

import model.Result;

import dao.ExamDAO;
import dao.GenericDAO;
import daoImpl.ExamDAOImpl;
import daoImpl.GenericDAOImpl;
import model.EntityBean;
import model.Exam;
import model.Question;

public class ExamManager {

	private GenericDAO<EntityBean> dao = new GenericDAOImpl();
	private ExamDAO examDAO = new ExamDAOImpl();
	private final int NUMBER_OF_ATTEMPTS = 10;

	public String addExam(Exam exam) {
		String examID;

		for (int i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
			examID = RandomCodeGenerator.generate();
			Exam ex = (Exam) dao.findByID(Exam.class, examID);
			if (ex == null) {
				exam.setID(examID);
				dao.create(exam);
				return examID;
			}
		}
		return null;
	}
	
	public Set<Question> getQuestions(Exam exam)
	{
		examDAO.getQuestions(exam);
		return exam.getQuestions();
	}
	
	public Set<Result> getResults(Exam exam)
	{
		examDAO.getResults(exam);
		return exam.getResults();
	}
	
	
}
