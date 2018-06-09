package com.softwareControl.Model;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3884034975174869740L;
	private Integer sno;
	private String role;
	private String sname;
	private String sclass;
	private String strength;
	private String shobby;
	private String spassword;
	private Set groupsesForGmem4 = new HashSet(0);
	private Set groupsesForGmem3 = new HashSet(0);
	private Set groupsesForGmem2 = new HashSet(0);
	private Set groupsesForGmem1 = new HashSet(0);
	private Set groupsesForGleader = new HashSet(0);
	private Set grades = new HashSet(0);
	private Set files = new HashSet(0);
	private Set files_1 = new HashSet(0);
	private Set groupsesForGmem3_1 = new HashSet(0);
	private Set groupsesForGmem2_1 = new HashSet(0);
	private Set groupsesForGmem1_1 = new HashSet(0);
	private Set groupsesForGleader_1 = new HashSet(0);
	private Set chats = new HashSet(0);
	private Set groupsesForGmem4_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String spassword) {
		this.spassword = spassword;
	}

	/** full constructor */
	public Student(String role, String sname, String sclass, String strength, String shobby, String spassword,
			Set groupsesForGmem4, Set groupsesForGmem3, Set groupsesForGmem2, Set groupsesForGmem1,
			Set groupsesForGleader, Set grades, Set files, Set files_1, Set groupsesForGmem3_1, Set groupsesForGmem2_1,
			Set groupsesForGmem1_1, Set groupsesForGleader_1, Set chats, Set groupsesForGmem4_1) {
		this.role = role;
		this.sname = sname;
		this.sclass = sclass;
		this.strength = strength;
		this.shobby = shobby;
		this.spassword = spassword;
		this.groupsesForGmem4 = groupsesForGmem4;
		this.groupsesForGmem3 = groupsesForGmem3;
		this.groupsesForGmem2 = groupsesForGmem2;
		this.groupsesForGmem1 = groupsesForGmem1;
		this.groupsesForGleader = groupsesForGleader;
		this.grades = grades;
		this.files = files;
		this.files_1 = files_1;
		this.groupsesForGmem3_1 = groupsesForGmem3_1;
		this.groupsesForGmem2_1 = groupsesForGmem2_1;
		this.groupsesForGmem1_1 = groupsesForGmem1_1;
		this.groupsesForGleader_1 = groupsesForGleader_1;
		this.chats = chats;
		this.groupsesForGmem4_1 = groupsesForGmem4_1;
	}

	// Property accessors

	public Integer getSno() {
		return this.sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSclass() {
		return this.sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getStrength() {
		return this.strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getShobby() {
		return this.shobby;
	}

	public void setShobby(String shobby) {
		this.shobby = shobby;
	}

	public String getSpassword() {
		return this.spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public Set getGroupsesForGmem4() {
		return this.groupsesForGmem4;
	}

	public void setGroupsesForGmem4(Set groupsesForGmem4) {
		this.groupsesForGmem4 = groupsesForGmem4;
	}

	public Set getGroupsesForGmem3() {
		return this.groupsesForGmem3;
	}

	public void setGroupsesForGmem3(Set groupsesForGmem3) {
		this.groupsesForGmem3 = groupsesForGmem3;
	}

	public Set getGroupsesForGmem2() {
		return this.groupsesForGmem2;
	}

	public void setGroupsesForGmem2(Set groupsesForGmem2) {
		this.groupsesForGmem2 = groupsesForGmem2;
	}

	public Set getGroupsesForGmem1() {
		return this.groupsesForGmem1;
	}

	public void setGroupsesForGmem1(Set groupsesForGmem1) {
		this.groupsesForGmem1 = groupsesForGmem1;
	}

	public Set getGroupsesForGleader() {
		return this.groupsesForGleader;
	}

	public void setGroupsesForGleader(Set groupsesForGleader) {
		this.groupsesForGleader = groupsesForGleader;
	}

	public Set getGrades() {
		return this.grades;
	}

	public void setGrades(Set grades) {
		this.grades = grades;
	}

	public Set getFiles() {
		return this.files;
	}

	public void setFiles(Set files) {
		this.files = files;
	}

	public Set getFiles_1() {
		return this.files_1;
	}

	public void setFiles_1(Set files_1) {
		this.files_1 = files_1;
	}

	public Set getGroupsesForGmem3_1() {
		return this.groupsesForGmem3_1;
	}

	public void setGroupsesForGmem3_1(Set groupsesForGmem3_1) {
		this.groupsesForGmem3_1 = groupsesForGmem3_1;
	}

	public Set getGroupsesForGmem2_1() {
		return this.groupsesForGmem2_1;
	}

	public void setGroupsesForGmem2_1(Set groupsesForGmem2_1) {
		this.groupsesForGmem2_1 = groupsesForGmem2_1;
	}

	public Set getGroupsesForGmem1_1() {
		return this.groupsesForGmem1_1;
	}

	public void setGroupsesForGmem1_1(Set groupsesForGmem1_1) {
		this.groupsesForGmem1_1 = groupsesForGmem1_1;
	}

	public Set getGroupsesForGleader_1() {
		return this.groupsesForGleader_1;
	}

	public void setGroupsesForGleader_1(Set groupsesForGleader_1) {
		this.groupsesForGleader_1 = groupsesForGleader_1;
	}

	public Set getChats() {
		return this.chats;
	}

	public void setChats(Set chats) {
		this.chats = chats;
	}

	public Set getGroupsesForGmem4_1() {
		return this.groupsesForGmem4_1;
	}

	public void setGroupsesForGmem4_1(Set groupsesForGmem4_1) {
		this.groupsesForGmem4_1 = groupsesForGmem4_1;
	}

}