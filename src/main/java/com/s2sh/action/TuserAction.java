package com.s2sh.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.transaction.Transaction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.opensymphony.xwork2.ActionSupport;
import com.s2sh.entity.Tuser;
import com.s2sh.service.ITuserService;


public class TuserAction extends ActionBase{
	
	private static final Log log = LogFactory.getLog(TuserAction.class);
	private ITuserService userService;
	private Tuser tuser;
	private List<Tuser> list;

	public List<Tuser> getList() {
		return list;
	}

	public void setList(List<Tuser> list) {
		this.list = list;
	}

	public Tuser getTuser() {
		return tuser;
	}

	public void setTuser(Tuser tuser) {
		this.tuser = tuser;
	}

	public ITuserService getUserService() {
		return userService;
	}

	public void setUserService(ITuserService userService) {
		this.userService = userService;
	}

	public String index(){
		Tuser login= userService.isLogin(tuser);
		if (login!=null) {
			session.put("user", login);
			return "index_view";
		}else {
			return "error_view";
		}
		
	}
}
