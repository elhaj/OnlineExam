package service;

import java.util.Set;

import dao.UserDAO;
import daoImpl.UserDAOImpl;
import model.Exam;
import model.User;

public class ProfessorManager {

	UserDAO dao = new UserDAOImpl();
	public Set<Exam> getExams(User user){
		dao.getExams(user);
		return user.getExams();
	}
}
