package com.softwareControl.Model;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -3498204862700666389L;
	private Integer tid;
	private String tname;
	private Integer tage;
	private String tsex;
	private String tposition;
	private String temail;
	private String ttel;
	private String tpassword;
	private Set files = new HashSet(0);
	private Set files_1 = new HashSet(0);
	private Set chats = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String temail, String ttel, String tpassword) {
		this.temail = temail;
		this.ttel = ttel;
		this.tpassword = tpassword;
	}

	/** full constructor */
	public Teacher(String tname, Integer tage, String tsex, String tposition, String temail, String ttel,
			String tpassword, Set files, Set files_1, Set chats) {
		this.tname = tname;
		this.tage = tage;
		this.tsex = tsex;
		this.tposition = tposition;
		this.temail = temail;
		this.ttel = ttel;
		this.tpassword = tpassword;
		this.files = files;
		this.files_1 = files_1;
		this.chats = chats;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getTage() {
		return this.tage;
	}

	public void setTage(Integer tage) {
		this.tage = tage;
	}

	public String getTsex() {
		return this.tsex;
	}

	public void setTsex(String tsex) {
		this.tsex = tsex;
	}

	public String getTposition() {
		return this.tposition;
	}

	public void setTposition(String tposition) {
		this.tposition = tposition;
	}

	public String getTemail() {
		return this.temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public String getTtel() {
		return this.ttel;
	}

	public void setTtel(String ttel) {
		this.ttel = ttel;
	}

	public String getTpassword() {
		return this.tpassword;
	}

	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
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

	public Set getChats() {
		return this.chats;
	}

	public void setChats(Set chats) {
		this.chats = chats;
	}

}