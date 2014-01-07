package com.s2sh.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Articletype entity. @author MyEclipse Persistence Tools
 */

public class Articletype implements java.io.Serializable {

	// Fields

	private Integer id;
	private String typename;
	private Set articles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Articletype() {
	}

	/** minimal constructor */
	public Articletype(String typename) {
		this.typename = typename;
	}

	/** full constructor */
	public Articletype(String typename, Set articles) {
		this.typename = typename;
		this.articles = articles;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public Set getArticles() {
		return this.articles;
	}

	public void setArticles(Set articles) {
		this.articles = articles;
	}

}