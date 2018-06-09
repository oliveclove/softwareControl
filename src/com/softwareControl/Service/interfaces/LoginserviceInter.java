package com.softwareControl.Service.interfaces;

public interface LoginserviceInter {
	public String checkTeacher(int userid,String password);
	public String checkStudent(int userid,String password);
	public String checkAdmin(int userid,String password);
}
