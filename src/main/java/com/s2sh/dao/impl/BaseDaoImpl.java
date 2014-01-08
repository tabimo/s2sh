package com.s2sh.dao.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.s2sh.dao.IBaseDao;
import com.s2sh.util.Pager;


public class BaseDaoImpl<T> implements IBaseDao<T> {	
	
	private final static Integer baseNum=1;//增删该返回的受影响行数
	
	private SessionFactory sessionFactory;  
	  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }  
  
    public Session getSession() {  
        return sessionFactory.getCurrentSession();  
    }
    
    @Override  
    public <T> void save(T t) {  
        getSession().save(t);  
    }  
  
    @Override  
    public <T> void delete(T t) {  
        getSession().delete(t);  
    }  
  
    @Override  
    public <T> void delete(Class<T> entityClass, Integer id) {  
        getSession().delete(get(entityClass, id));  
    }  
  
    @Override  
    public <T> void update(T t) {  
        getSession().update(t); 
    }  
  
    @Override  
    public <T> T get(Class<T> entityClass, Integer id) {  
        return (T) getSession().get(entityClass, id);  
    }  
  
    @Override  
    public <T> List<T> findAll(String hql, Class<T> entityClass) {  
        return findAll(hql, entityClass, new Object[] {});  
    }  
  
    @Override  
    public <T> List<T> findAll(String hql, Class<T> entityClass, Object param) {  
        return findAll(hql, entityClass, new Object[] { param });  
    }  
  
    @Override  
    public <T> List<T> findAll(String hql, Class<T> entityClass,   
            Object[] params) {  
        Query query = getSession().createQuery(hql);  
        for (int i = 0; i < params.length; i++) {  
            query.setParameter(i, params[i]);  
        }  
        return (List<T>) query.list();  
    }  
  
    @Override  
    public <T> List<T> findByPage(final String hql, Class<T> entityClass,  
            final int firstResult, final int maxResult) {  
        return findByPage(hql, entityClass, new Object[] {}, firstResult,  
                maxResult);  
    }  
  
    @Override  
    public <T> List<T> findByPage(final String hql, Class<T> entityClass,  
            final Object param, final int firstResult, final int maxResult) {  
        return findByPage(hql, entityClass, new Object[] { param },  
                firstResult, maxResult);  
    }  
  
    @Override  
    public <T> List<T> findByPage(final String hql, Class<T>     
            entityClass, final Object[] params, final int firstResult,   
            final int maxResult) {  
        Query query = getSession().createQuery(hql);  
        for (int i = 0; i < params.length; i++) {  
            query.setParameter(i, params[i]);  
        }  
        query.setFirstResult(firstResult);  
        query.setMaxResults(maxResult);  
        return (List<T>) query.list();  
    }  
	
}
