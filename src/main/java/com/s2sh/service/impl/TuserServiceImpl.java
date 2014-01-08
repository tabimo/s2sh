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
	public Tuser isLogin(Tuser tuser){
		try {
			DetachedCriteria dc=DetachedCriteria.forClass(Tuser.class);
			dc.add(Restrictions.eq("username", tuser.getUsername()));
			dc.add(Restrictions.eq("password", tuser.getPassword()));
			List<Tuser> list=(List<Tuser>) baseDao.findByDetachList(dc);
			System.out.println(list.size());
			if (list.size()>0) {
				return list.get(0);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
