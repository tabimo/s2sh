package com.s2sh.service;

import com.s2sh.entity.Tuser;

public interface ITuserService {

	/**
	 * 是否注册成功
	 * @param tuser
	 * @return
	 */
	public boolean isRegister(Tuser tuser);
	
	/**
	 * 是否登录成功
	 * @param tuser
	 * @return
	 */
	public Tuser isLogin(Tuser tuser);
	

}
