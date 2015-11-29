package service;

import java.util.Set;

import dao.UserDAO;
import daoImpl.UserDAOImpl;
import model.Result;
import model.User;

public class StudentManager {

	UserDAO dao = new UserDAOImpl();

	public Set<Result> getResults(User user) {

		dao.getResults(user);
		return user.getResults();
	}
}
