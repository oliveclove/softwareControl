package com.softwareControl.Service;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.softwareControl.Dao.StudentDAO;
import com.softwareControl.Model.Student;
import com.softwareControl.Service.interfaces.StudentServiceInter;

public class StudentService implements StudentServiceInter{

	private StudentDAO studentdao;
	
	public StudentDAO getStudentdao() {
		return studentdao;
	}

	public void setStudentdao(StudentDAO studentdao) {
		this.studentdao = studentdao;
	}

	@Override
	public List<Student> showall() {
		try{
			@SuppressWarnings("unchecked")
			List<Student> list=studentdao.findAll();
			if(list.size()!=0)
			{
				ServletActionContext.getRequest().setAttribute("student", list);
				return list;
			}
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String addStudent(Student stu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delStudent(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findbyName(String name) {
		@SuppressWarnings("unchecked")
		List<Student> list=studentdao.findAll();
		System.out.println(list.size());
		if(list.size()!=0){
			for(Student stu:list){
				if(stu.getSname().equals(name)){
					ServletActionContext.getRequest().setAttribute("stuInfo", stu);
					return "yes";
				}
			}
		}
		return "no";
	}

}
