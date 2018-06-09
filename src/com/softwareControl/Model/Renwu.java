package com.softwareControl.Model;

import java.util.Date;

/**
 * Renwu entity. @author MyEclipse Persistence Tools
 */

public class Renwu implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String taker;
	private Date begindate;
	private Date enddate;
	private String jinqu;

	// Constructors

	/** default constructor */
	public Renwu() {
	}

	/** full constructor */
	public Renwu(String title, String taker, Date begindate, Date enddate, String jinqu) {
		this.title = title;
		this.taker = taker;
		this.begindate = begindate;
		this.enddate = enddate;
		this.jinqu = jinqu;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTaker() {
		return this.taker;
	}

	public void setTaker(String taker) {
		this.taker = taker;
	}

	public Date getBegindate() {
		return this.begindate;
	}

	public void setBegindate(Date begindate) {
		this.begindate = begindate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getJinqu() {
		return this.jinqu;
	}

	public void setJinqu(String jinqu) {
		this.jinqu = jinqu;
	}

}