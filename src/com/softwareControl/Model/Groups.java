package com.softwareControl.Model;

/**
 * Groups entity. @author MyEclipse Persistence Tools
 */

public class Groups implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -5403217472402999247L;
	private Integer gid;
	private String gname;
	private String gleader;
	private String gmem1;
	private String gmem2;
	private String gmem3;
	private String gmem4;

	// Constructors

	/** default constructor */
	public Groups() {
	}

	/** minimal constructor */
	public Groups(String gname, String gleader) {
		this.gname = gname;
		this.gleader = gleader;
	}

	/** full constructor */
	public Groups(String gname, String gleader, String gmem1, String gmem2, String gmem3, String gmem4) {
		this.gname = gname;
		this.gleader = gleader;
		this.gmem1 = gmem1;
		this.gmem2 = gmem2;
		this.gmem3 = gmem3;
		this.gmem4 = gmem4;
	}

	// Property accessors

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return this.gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGleader() {
		return this.gleader;
	}

	public void setGleader(String gleader) {
		this.gleader = gleader;
	}

	public String getGmem1() {
		return this.gmem1;
	}

	public void setGmem1(String gmem1) {
		this.gmem1 = gmem1;
	}

	public String getGmem2() {
		return this.gmem2;
	}

	public void setGmem2(String gmem2) {
		this.gmem2 = gmem2;
	}

	public String getGmem3() {
		return this.gmem3;
	}

	public void setGmem3(String gmem3) {
		this.gmem3 = gmem3;
	}

	public String getGmem4() {
		return this.gmem4;
	}

	public void setGmem4(String gmem4) {
		this.gmem4 = gmem4;
	}

}