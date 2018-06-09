package com.softwareControl.Model;

import java.util.Date;


/**
 * Chat entity. @author MyEclipse Persistence Tools
 */

public class Chat implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -5806325420916682558L;
	private Integer chid;
	private String chowner;
	private Date chdate;
	private String chcontent;

	// Constructors

	/** default constructor */
	public Chat() {
	}

	/** minimal constructor */
	public Chat(String chowner, Date chdate) {
		this.chowner = chowner;
		this.chdate = chdate;
	}

	/** full constructor */
	public Chat(String chowner, Date chdate, String chcontent) {
		this.chowner = chowner;
		this.chdate = chdate;
		this.chcontent = chcontent;
	}

	// Property accessors

	public Integer getChid() {
		return this.chid;
	}

	public void setChid(Integer chid) {
		this.chid = chid;
	}

	public String getChowner() {
		return this.chowner;
	}

	public void setChowner(String chowner) {
		this.chowner = chowner;
	}

	public Date getChdate() {
		return this.chdate;
	}

	public void setChdate(Date chdate) {
		this.chdate = chdate;
	}

	public String getChcontent() {
		return this.chcontent;
	}

	public void setChcontent(String chcontent) {
		this.chcontent = chcontent;
	}

}