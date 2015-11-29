package dao;

import java.util.List;

import org.hibernate.Query;

import model.EntityBean;

public interface GenericDAO<T extends EntityBean> {

	public void create(T entity);
	public T findByID(Class classz, Integer id);
	public void update(T entity);
	public List<T> findMany(Query query);
	public T findOne(Query query);
}
