package com.s2sh.entity;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	private Integer id;//add 
	private Articletype articletype;
	private Tuser tuser;
	private String keyword;
	private String title;
	private String content;
	private Integer createtime;
	private Integer publictime;
	private Integer status;
	private Integer praisecount;
	private String summary;

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(Articletype articletype, Tuser tuser, String title,
			String content, String summary) {
		this.articletype = articletype;
		this.tuser = tuser;
		this.title = title;
		this.content = content;
		this.summary = summary;
	}

	/** full constructor */
	public Article(Articletype articletype, Tuser tuser, String keyword,
			String title, String content, Integer createtime,
			Integer publictime, Integer status, Integer praisecount,
			String summary) {
		this.articletype = articletype;
		this.tuser = tuser;
		this.keyword = keyword;
		this.title = title;
		this.content = content;
		this.createtime = createtime;
		this.publictime = publictime;
		this.status = status;
		this.praisecount = praisecount;
		this.summary = summary;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Articletype getArticletype() {
		return this.articletype;
	}

	public void setArticletype(Articletype articletype) {
		this.articletype = articletype;
	}

	public Tuser getTuser() {
		return this.tuser;
	}

	public void setTuser(Tuser tuser) {
		this.tuser = tuser;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public Integer getPublictime() {
		return this.publictime;
	}

	public void setPublictime(Integer publictime) {
		this.publictime = publictime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPraisecount() {
		return this.praisecount;
	}

	public void setPraisecount(Integer praisecount) {
		this.praisecount = praisecount;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}