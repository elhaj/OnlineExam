package dao;

import model.User;

public interface UserDAO {
	public void getExams(User user);
	public void getResults(User user);
}
