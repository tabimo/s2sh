package com.s2sh.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.DetachedCriteria;

import com.s2sh.util.Pager;

public interface IBaseDao<T> {
	public <T> void save(T t);

	public <T> void delete(T t);

	public <T> void delete(Class<T> entityClass, Integer id);

	public <T> void update(T t);

	public <T> T get(Class<T> entityClass, Integer id);

	public <T> List<T> findAll(String hql, Class<T> entityClass);

	public <T> List<T> findAll(String hql, Class<T> entityClass, Object param);

	public <T> List<T> findAll(String hql, Class<T> entityClass, Object[] params);

	public <T> List<T> findByPage(final String hql, final Class<T> entityClass,
			final int firstResult, final int maxResult);

	public <T> List<T> findByPage(final String hql, final Class<T> entityClass,
			final Object param, final int firstResult, final int maxResult);

	public <T> List<T> findByPage(final String hql, final Class<T> entityClass,
			final Object[] params, final int firstResult, final int maxResult);
	
	/**
	 * 获得结果集
	 * @param sql  SQL语句
	 * @return 结果集
	 */
	public List<Object[]> findBySql(String sql);

	/**
	 * 获得结果集
	 * @param sql SQL语句
	 * @param page 要显示第几页
	 * @param rows 每页显示多少条
	 * @return 结果集
	 */
	public List<Object[]> findBySql(String sql, int page, int rows);

	/**
	 * 获得结果集
	 * @param sql SQL语句
	 * @param params  参数
	 * @return 结果集
	 */
	public List<Object[]> findBySql(String sql, Map<String, Object> params);

	/**
	 * 获得结果集
	 * @param sql SQL语句
	 * @param params 参数
	 * @param page 要显示第几页
	 * @param rows 每页显示多少条
	 * @return 结果集
	 */
	public List<Object[]> findBySql(String sql, Map<String, Object> params, int page, int rows);

	/**
	 * 执行SQL语句
	 * @param sql SQL语句
	 * @return 响应行数
	 */
	public int executeSql(String sql);

	/**
	 * 执行SQL语句
	 * @param sql SQL语句
	 * @param params  参数
	 * @return 响应行数
	 */
	public int executeSql(String sql, Map<String, Object> params);

	/**
	 * 统计
	 * @param sql  SQL语句
	 * @return 数目
	 */
	public BigInteger countBySql(String sql);
	/**
	 * 统计
	 * @param sql SQL语句
	 * @param params 参数
	 * @return 数目
	 */
	public BigInteger countBySql(String sql, Map<String, Object> params);
}
