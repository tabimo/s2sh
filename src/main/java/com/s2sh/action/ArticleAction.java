package com.s2sh.action;

import java.util.List;


import com.s2sh.entity.Articletype;
import com.s2sh.service.IArticleTypeService;

public class ArticleAction extends ActionBase{
	private List<Articletype> articletypeList;
	private IArticleTypeService articleTypeService;

	public IArticleTypeService getArticleTypeService() {
		return articleTypeService;
	}

	public void setArticleTypeService(IArticleTypeService articleTypeService) {
		this.articleTypeService = articleTypeService;
	}
	
	public List<Articletype> getArticletypeList() {
		return articletypeList;
	}

	public void setArticletypeList(List<Articletype> articletypeList) {
		this.articletypeList = articletypeList;
	}

	public String publishArticle(){
		System.out.println("进入action方法！！！");
		articletypeList = (List<Articletype>) articleTypeService.getArticleTypeList();
		return "get_article";
		
	}
}
