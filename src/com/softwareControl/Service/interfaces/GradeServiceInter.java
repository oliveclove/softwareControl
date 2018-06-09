package com.softwareControl.Service.interfaces;

import java.util.List;

import com.softwareControl.Model.Grade;

public interface GradeServiceInter {
	public String addGrade(Grade grade);
	public Grade findbyName(String name);
	public List<Grade> showall();
	public String update(Grade grade);
}
