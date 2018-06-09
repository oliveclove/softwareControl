package com.softwareControl.Model;

import java.util.Date;

/**
 * File entity. @author MyEclipse Persistence Tools
 */

public class File implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 166573520132372853L;
	private Integer fid;
	private String fname;
	private String fowner;
	private String furl;
	private Date fdate;

	// Constructors

	/** default constructor */
	public File() {
	}

	/** full constructor */
	public File(String fname, String fowner, String furl, Date fdate) {
		this.fname = fname;
		this.fowner = fowner;
		this.furl = furl;
		this.fdate = fdate;
	}

	// Property accessors

	public Integer getFid() {
		return this.fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFowner() {
		return this.fowner;
	}

	public void setFowner(String fowner) {
		this.fowner = fowner;
	}

	public String getFurl() {
		return this.furl;
	}

	public void setFurl(String furl) {
		this.furl = furl;
	}

	public Date getFdate() {
		return this.fdate;
	}

	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}

}