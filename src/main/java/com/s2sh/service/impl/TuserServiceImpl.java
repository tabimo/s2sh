package com.s2sh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.s2sh.dao.IBaseDao;
import com.s2sh.entity.Tuser;
import com.s2sh.service.ITuserService;

public class TuserServiceImpl implements ITuserService {

	private IBaseDao<Tuser> baseDao;

	public IBaseDao<Tuser> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(IBaseDao<Tuser> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public boolean isRegister(Tuser tuser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tuser isLogin(Tuser tuser) {
		System.out.println("进入service方法！！！");
		String hql = "from Tuser where username = ? and password = ?";
		List<Tuser> list = baseDao.findAll(hql, Tuser.class, new Object[] {
				tuser.getUsername(), tuser.getPassword() });
		if (list.size() > 0) {
			return (Tuser) list.get(0);
		}
		return null;
	}
}
