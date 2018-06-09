package com.softwareControl.Service.interfaces;

import java.util.List;

import com.softwareControl.Model.Student;

public interface StudentServiceInter {
	public List<Student> showall();
	public String findbyName(String name);
	public String addStudent(Student stu);
	public String updateStudent(Student stu);
	public String delStudent(String name);
}
