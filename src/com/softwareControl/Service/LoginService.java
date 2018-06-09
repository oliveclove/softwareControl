package com.softwareControl.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.struts2.ServletActionContext;

import com.softwareControl.Dao.AdminDAO;
import com.softwareControl.Dao.StudentDAO;
import com.softwareControl.Dao.TeacherDAO;
import com.softwareControl.Model.Admin;
import com.softwareControl.Model.Student;
import com.softwareControl.Model.Teacher;
import com.softwareControl.Service.interfaces.LoginserviceInter;

@Transactional
public class LoginService implements LoginserviceInter{
	
	private TeacherDAO teacherdao;
	private StudentDAO studentdao;
	private AdminDAO admindao;
	
	
	public AdminDAO getAdmindao() {
		return admindao;
	}

	public void setAdmindao(AdminDAO admindao) {
		this.admindao = admindao;
	}

	public StudentDAO getStudentdao() {
		return studentdao;
	}

	public void setStudentdao(StudentDAO studentdao) {
		this.studentdao = studentdao;
	}

	public TeacherDAO getTeacherdao() {
		return teacherdao;
	}

	public void setTeacherdao(TeacherDAO teacherdao) {
		this.teacherdao = teacherdao;
	}

	@Override
	public String checkTeacher(int userid, String password) {
		try{
			@SuppressWarnings("unchecked")
			List<Teacher> list=(List<Teacher>) teacherdao.findAll();
			if(list.size()!=0){
				for(Teacher teacher:list){
					if(teacher.getTid()==userid&&teacher.getTpassword().equals(password)){
						Teacher tea=teacher;
						ServletActionContext.getRequest().getSession().setAttribute("teacher", tea);
						return "yes";
					}
				}
				return "no";
			}
			return "no";
		}catch (Exception e) {
			e.printStackTrace();
			return "no";
		}
	}

	@Override
	public String checkStudent(int userid, String password) {
		try{
			@SuppressWarnings("unchecked")
			List<Student> list=studentdao.findAll();
			if(list.size()!=0){
				for(Student stu:list){
					if(stu.getSno()==userid&&stu.getSpassword().equals(password)){
						Student student=stu;
						ServletActionContext.getRequest().getSession().setAttribute("student", student);
						return "yes";
					}
				}
				return "no";
			}
			return "no";
		}catch (Exception e) {
			e.printStackTrace();
			return "no";
		}
		
	}

	@Override
	public String checkAdmin(int userid, String password) {
		try{
			@SuppressWarnings("unchecked")
			List<Admin> list=admindao.findAll();
			System.out.println(list);
			if(list.size()!=0){
				for(Admin ad:list){
					if(ad.getAid()==userid&&ad.getApassword().equals(password)){
						Admin admin=ad;
						ServletActionContext.getRequest().getSession().setAttribute("admin", admin);
						return "yes";
					}
				}
				return "no";
			}
			return "no";
		}catch (Exception e) {
			e.printStackTrace();
			return "no";
		}
	}
	
	
}
