package com.softwareControl.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.softwareControl.Model.Student;
import com.softwareControl.Service.StudentService;

public class StudentAction implements Action{
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public String execute() throws Exception {
		try{
			List<Student> list=studentService.showall();
			if(list.size()!=0){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
	
	public String findbyName() throws Exception{
		try{
			Student stu=(Student) ServletActionContext.getRequest().getSession().getAttribute("student");
			System.out.println(stu.getSname());
			String result=studentService.findbyName(stu.getSname());
			System.out.println(result);
			if(result.equals("yes")){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
}
