package com.softwareControl.Service.interfaces;

import java.util.List;

import com.softwareControl.Model.Teacher;

public interface TeacherServiceInter {
	public String addTeacher(Teacher teacher);
	public List<Teacher> showTeacher();
	public Teacher findbyId();
	public String updateTeacher(Teacher teacher);
	public String delTeacher(String name);
}
