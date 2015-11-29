package daoImpl;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import dao.ExamDAO;
import model.Exam;

public class ExamDAOImpl implements ExamDAO {

	private SessionFactory sessionFactory;

	public ExamDAOImpl() {
		// TODO Auto-generated constructor stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties());
		sessionFactory = cfg.buildSessionFactory(builder.build());
	}
	@Override
	public void getQuestions(Exam exam) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Exam ex = (Exam) session.get(Exam.class, exam.getExamID());

		Transaction tr = session.beginTransaction();
		Hibernate.initialize(ex.getQuestions());
		exam.setQuestions(ex.getQuestions());
		tr.commit();
		session.close();
	}
	@Override
	public void getResults(Exam exam) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Exam ex = (Exam) session.get(Exam.class, exam.getExamID());

		Transaction tr = session.beginTransaction();
		Hibernate.initialize(ex.getResults());
		exam.setResults(ex.getResults());
		tr.commit();
		session.close();
	}

}
