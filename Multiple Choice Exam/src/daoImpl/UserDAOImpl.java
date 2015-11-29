package daoImpl;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import dao.UserDAO;
import model.Exam;
import model.User;

public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public UserDAOImpl() {
		// TODO Auto-generated constructor stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties());
		sessionFactory = cfg.buildSessionFactory(builder.build());
	}

	@Override
	public void getExams(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		User us = (User) session.get(User.class, user.getUserID());

		Transaction tr = session.beginTransaction();
		Hibernate.initialize(us.getExams());
		user.setExams(us.getExams());
		tr.commit();
		session.close();
	}

	@Override
	public void getResults(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		User us = (User) session.get(User.class, user.getUserID());

		Transaction tr = session.beginTransaction();
		Hibernate.initialize(us.getResults());
		user.setResults(us.getResults());
		tr.commit();
		session.close();
	}

}
