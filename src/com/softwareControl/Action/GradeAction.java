package com.softwareControl.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.softwareControl.Model.Grade;
import com.softwareControl.Model.Student;
import com.softwareControl.Service.GradeService;

public class GradeAction implements Action{
	
	private String sno;
	private String sname;
	private String gname;
	private String grade1;
	private String grade2;
	private String grade3;
	private String grade;
	
	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGrade1() {
		return grade1;
	}

	public void setGrade1(String grade1) {
		this.grade1 = grade1;
	}

	public String getGrade2() {
		return grade2;
	}

	public void setGrade2(String grade2) {
		this.grade2 = grade2;
	}

	public String getGrade3() {
		return grade3;
	}

	public void setGrade3(String grade3) {
		this.grade3 = grade3;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	private GradeService gradeservice;

	public GradeService getGradeservice() {
		return gradeservice;
	}

	public void setGradeservice(GradeService gradeservice) {
		this.gradeservice = gradeservice;
	}

	@Override
	public String execute() throws Exception {
		try{
			List<Grade> list=gradeservice.showall();
			if(list.size()!=0){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
	
	public String addGrade() throws Exception{
		int stu_no=Integer.parseInt(sno);
		int stu_grade1=Integer.parseInt(grade1);
		int stu_grade2=Integer.parseInt(grade2);
		int stu_grade3=Integer.parseInt(grade3);
		int stu_grade=Integer.parseInt(grade);
		try{
			System.out.println(stu_no);
			Grade g=new Grade();
			g.setSno(stu_no);
			g.setSname(sname);
			g.setGrade1(stu_grade1);
			g.setGrade2(stu_grade2);
			g.setGrade3(stu_grade3);
			g.setGrade(stu_grade);
			String result=gradeservice.addGrade(g);
			if(result.equals("yes")){
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
			Grade grade=gradeservice.findbyName(gname);
			if(grade!=null){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
	
	public String findbysession() throws Exception{
		System.out.println("findbysession方法被执行了");
		try{
			Student stu=(Student) ServletActionContext.getRequest().getSession().getAttribute("student");
			String name=stu.getSname();
			System.out.println(name);
			Grade grade=gradeservice.findbyName(name);
			if(grade!=null){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
}
