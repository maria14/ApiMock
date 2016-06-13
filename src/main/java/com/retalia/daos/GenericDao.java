package com.retalia.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.retalia.models.User;
import com.retalia.utils.HibernateUtil;

public class GenericDao {
	
	
	private Session session;
	
	public GenericDao(){
		session= HibernateUtil.getSessionAnnotationFactory().getCurrentSession();	
		session.beginTransaction();
	}
	
	public Object get(Class clazz, Serializable id){
		
		Object obj=(session.get(clazz,id));
		return obj;
	}
	
	public List<?> get(Class clazz){
		List<?> elements= (List<?>) session.createCriteria(clazz).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return elements;
	}

}
