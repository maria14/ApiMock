package com.retalia.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.retalia.App;
import com.retalia.models.User;
import com.retalia.utils.HibernateUtil;

public class GenericDao {
	
	
	//private Session session;
	
	public GenericDao(){
		//session=App.getSession();
	}
	
	public Object get(Class clazz, Serializable id){
		Session session= HibernateUtil.getSessionAnnotationFactory().openSession();
		session.beginTransaction();
		
		Object obj=(session.get(clazz,id));
		return obj;
	}
	
	public List<?> get(Class clazz){
		Session session= HibernateUtil.getSessionAnnotationFactory().openSession();
		session.beginTransaction();
		List<?> elements= (List<?>) session.createCriteria(clazz).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return elements;
	}
	
	public void save(Object obj){
		Session session= HibernateUtil.getSessionAnnotationFactory().openSession();
		Transaction t =session.beginTransaction();
		session.save(obj);
		t.commit();
		/*session.getTransaction().commit();
		session.beginTransaction();*/
		
		
	}

}
