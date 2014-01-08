package com.s2sh.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.s2sh.dao.IBaseDao;
import com.s2sh.entity.Articletype;
import com.s2sh.service.IArticleTypeService;

@Service
public class ArticleTypeServiceImpl implements IArticleTypeService {
	private IBaseDao<Articletype> baseDao;
	
	public IBaseDao<Articletype> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(IBaseDao<Articletype> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public List<?> getArticleTypeList() {
		// TODO Auto-generated method stub
		return baseDao.findAll(" from Articletype",-1,null);
	}
	
}
