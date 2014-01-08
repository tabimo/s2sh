package com.s2sh.dao.impl;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;


import com.s2sh.dao.IBaseDao;
import com.s2sh.entity.Tuser;
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
    public int save(T t) { 
    	try {
    		getSession().save(t);
            return baseNum;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
        
    }  
  
    @Override  
    public int delete(T t) { 
        try {
    		getSession().delete(t);
            return baseNum;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
    }  
  
    @Override  
    public int deleteById(Class<?> entityClass, Integer id) {  
    	try {
    		getSession().delete(get(entityClass, id));  
    		return baseNum;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
    }  
  
    @Override  
    public int update(T t) {  
    	try {
    		getSession().update(t); 
    		return baseNum;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
    }  
  
    @Override  
    public Object get(Class<?> entityClass, Integer id) {  
        return getSession().get(entityClass, id);  
    }  
  
    @Override  
    public List<?> findAll(String hql,int num,Class<?> entityClass,   
            Object[] params) {  
        Query query = getSession().createQuery(hql);  
        for (int i = 0; i < params.length; i++) {  
            query.setParameter(i, params[i]);  
        }  
        if (num!=-1) {
        	return query.setMaxResults(num).list();
		}else{
			return query.list();
		}
    }  
  
    @Override  
    public List<?> findByPage(final String hql, Class<?>     
            entityClass, final Object[] params, final int firstResult,   
            final int maxResult) {  
        Query query = getSession().createQuery(hql);  
        for (int i = 0; i < params.length; i++) {  
            query.setParameter(i, params[i]);  
        }  
        query.setFirstResult(firstResult);  
        query.setMaxResults(maxResult);  
        return query.list();  
    }  
    @Override  
	public List<Object[]> findBySql(String sql) {
		SQLQuery q = getSession().createSQLQuery(sql);
		return q.list();
	}
	@Override  
	public List<Object[]> findBySqlPagerList(String sql, int page, int rows) {
		SQLQuery q = getSession().createSQLQuery(sql);
		return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
	}

	@Override  
	public List<Object[]> findBySql(String sql, Map<String, Object> params) {
		SQLQuery q = getSession().createSQLQuery(sql);
		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		return q.list();
	}
	@Override  
	public List<Object[]> findBySqlPagerList(String sql, Map<String, Object> params, int page, int rows) {
		SQLQuery q = getSession().createSQLQuery(sql);
		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
	}
	@Override  
	public int executeSql(String sql) {
		SQLQuery q = getSession().createSQLQuery(sql);
		return q.executeUpdate();
	}
	@Override  
	public int executeSql(String sql, Map<String, Object> params) {
		SQLQuery q = getSession().createSQLQuery(sql);
		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		return q.executeUpdate();
	}
	@Override  
	public Integer countBySql(String sql) {
		SQLQuery q = getSession().createSQLQuery(sql);
		return (Integer) q.uniqueResult();
	}
	@Override  
	public Integer countBySql(String sql, Map<String, Object> params) {
		SQLQuery q = getSession().createSQLQuery(sql);
		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				q.setParameter(key, params.get(key));
			}
		}
		return (Integer) q.uniqueResult();
	}
	
	@Override
	public Integer findByCountList(DetachedCriteria dc) throws Exception {
		// TODO Auto-generated method stub
		Criteria c =  dc.getExecutableCriteria(getSession());
		List<?> list = c.list();
		return list.size();
	}
	
	@Override
	public List<?> findByDetachList(DetachedCriteria dc) throws Exception {
		// TODO Auto-generated method stub
		Criteria c =  dc.getExecutableCriteria(getSession());
		List<?> list = c.list();
		return list;
	}
	
	@Override
	public List<?> findByDetachList(DetachedCriteria dc, Pager page)
			throws Exception {
		Criteria c =  dc.getExecutableCriteria(getSession());
		//分页
		c.setFirstResult(page.getPageSize()*page.getCurrentPage());
		c.setMaxResults(page.getPageSize());
		List<?> list = c.list();
		return list;
	}
  
}
