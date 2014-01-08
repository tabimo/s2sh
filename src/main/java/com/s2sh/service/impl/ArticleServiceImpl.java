package com.s2sh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.s2sh.dao.IBaseDao;
import com.s2sh.entity.Article;
import com.s2sh.service.IArticleService;

import antlr.collections.List;

public class ArticleServiceImpl implements IArticleService {
	public static int ART_NEW=1;
	public static int ART_RECOMMEND=2;
	public static int ART_HOT=3;

	private IBaseDao<Article> baseDao;
	
}
