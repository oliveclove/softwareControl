package com.softwareControl.Model;

/**
 * Grade entity. @author MyEclipse Persistence Tools
 */

public class Grade implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -470071531194800592L;
	private Integer sno;
	private String sname;
	private Integer grade1;
	private Integer grade2;
	private Integer grade3;
	private Integer grade;

	// Constructors

	/** default constructor */
	public Grade() {
	}

	/** full constructor */
	public Grade(String sname, Integer grade1, Integer grade2, Integer grade3, Integer grade) {
		this.sname = sname;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade = grade;
	}

	// Property accessors

	public Integer getSno() {
		return this.sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getGrade1() {
		return this.grade1;
	}

	public void setGrade1(Integer grade1) {
		this.grade1 = grade1;
	}

	public Integer getGrade2() {
		return this.grade2;
	}

	public void setGrade2(Integer grade2) {
		this.grade2 = grade2;
	}

	public Integer getGrade3() {
		return this.grade3;
	}

	public void setGrade3(Integer grade3) {
		this.grade3 = grade3;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

}