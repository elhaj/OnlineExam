package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.GenericDAO;
import model.EntityBean;

@Repository
public class GenericDAOImpl implements GenericDAO<EntityBean> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(EntityBean entity) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(entity);
	}

	@Override
	public EntityBean findByID(Class classz, Integer id) {
		// TODO Auto-generated method stub
		EntityBean entity = null;
		entity = (EntityBean) sessionFactory.getCurrentSession().get(classz, id);
		return entity;
	}

	@Override
	public void update(EntityBean entity) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(entity);
	}

	@Override
	public List<EntityBean> findMany(Query query) {
		// TODO Auto-generated method stub
		List<EntityBean> beans = null;
		beans = query.list();
		return beans;
	}

	@Override
	public EntityBean findOne(Query query) {
		// TODO Auto-generated method stub
		EntityBean entity = null;
		entity = (EntityBean) query.uniqueResult();
		return entity;
	}

}
