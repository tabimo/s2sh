package com.s2sh.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;

import com.s2sh.util.Pager;
public interface IBaseDao<T> {
	public int save(T t);

	public int delete(T t);

	public int deleteById(Class<?> entityClass, Integer id);

	public int update(T t);

	public Object get(Class<?> entityClass, Integer id);
	
	/**
	 * 获得指定数量的结果集
	 * @param hql 
	 * @param num 如果num等于-1,表示查询所有结果集。
	 * @param entityClass
	 * @param params
	 * @return
	 */
	public List<?> findAll(String hql,int num, Class<?> entityClass, Object[] params);

	/**
	 * 
	 * @param hql
	 * @param entityClass
	 * @param params
	 * @param firstResult
	 * @param maxResult
	 * @return
	 */
	public List<?> findByPage(final String hql, final Class<?> entityClass,
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
	public List<Object[]> findBySqlPagerList(String sql, int page, int rows);

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
	public List<Object[]> findBySqlPagerList(String sql, Map<String, Object> params, int page, int rows);

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
	public Integer countBySql(String sql);
	/**
	 * 统计
	 * @param sql SQL语句
	 * @param params 参数
	 * @return 数目
	 */
	public Integer countBySql(String sql, Map<String, Object> params);
	
	/**
	 * 组合查询
	 * @param dc
	 * @return 返回结果集
	 * @throws Exception
	 */
	public List<?> findByDetachList(DetachedCriteria dc) throws Exception;
	
	/**
	 * 组合查询带分页
	 * @param dc 组合
	 * @param page 分页对象
	 * @return
	 * @throws Exception
	 */
	public List<?> findByDetachList(DetachedCriteria dc,Pager page) throws Exception;
	
	/**
	 * 查询总记录个数
	 * @param dc
	 * @return
	 * @throws Exception
	 */
	public Integer findByCountList(DetachedCriteria dc) throws Exception;
}
