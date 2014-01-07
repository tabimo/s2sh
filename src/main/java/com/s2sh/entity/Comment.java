package com.s2sh.entity;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tuser tuser;
	private Integer modelid;
	private String model;
	private String content;
	private Integer time;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(Tuser tuser, Integer modelid, String content) {
		this.tuser = tuser;
		this.modelid = modelid;
		this.content = content;
	}

	/** full constructor */
	public Comment(Tuser tuser, Integer modelid, String model, String content,
			Integer time) {
		this.tuser = tuser;
		this.modelid = modelid;
		this.model = model;
		this.content = content;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Tuser getTuser() {
		return this.tuser;
	}

	public void setTuser(Tuser tuser) {
		this.tuser = tuser;
	}

	public Integer getModelid() {
		return this.modelid;
	}

	public void setModelid(Integer modelid) {
		this.modelid = modelid;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}