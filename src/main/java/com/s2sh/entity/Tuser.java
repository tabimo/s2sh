package com.s2sh.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Tuser entity. @author MyEclipse Persistence Tools
 */

public class Tuser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nickname;
	private String username;
	private String password;
	private String email;
	private Integer sex;
	private String tel;
	private String image;
	private Integer createtime;
	private Integer jointime;
	private Integer status;
	private Set articles = new HashSet(0);
	private Set comments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tuser() {
	}

	/** minimal constructor */
	public Tuser(String nickname, String password) {
		this.nickname = nickname;
		this.password = password;
	}

	/** full constructor */
	public Tuser(String nickname, String username, String password,
			String email, Integer sex, String tel, String image,
			Integer createtime, Integer jointime, Integer status, Set articles,
			Set comments) {
		this.nickname = nickname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.sex = sex;
		this.tel = tel;
		this.image = image;
		this.createtime = createtime;
		this.jointime = jointime;
		this.status = status;
		this.articles = articles;
		this.comments = comments;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public Integer getJointime() {
		return this.jointime;
	}

	public void setJointime(Integer jointime) {
		this.jointime = jointime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set getArticles() {
		return this.articles;
	}

	public void setArticles(Set articles) {
		this.articles = articles;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

}