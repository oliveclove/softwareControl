package com.softwareControl.Action;

import com.opensymphony.xwork2.Action;
import com.softwareControl.Model.Teacher;
import com.softwareControl.Service.TeacherService;

public class TeacherAction implements Action{

	private TeacherService teacherService;
	
	public TeacherService getTeacherService() {
		return teacherService;
	}


	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	private String username;
	private String email;
	private String tel;
	private String password;
	private String sname;
	
	
	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String execute() throws Exception {
		Teacher teacher=new Teacher();
		teacher.setTname(username);
		teacher.setTemail(email);
		teacher.setTtel(tel);
		teacher.setTpassword(password);
		try{
			teacherService.addTeacher(teacher);
			System.out.println("²Ù×÷³É¹¦");
			return "ok";
		}catch (Exception e) {
			return "err";
		}
	}
	
}
