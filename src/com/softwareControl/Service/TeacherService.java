package com.softwareControl.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.softwareControl.Dao.TeacherDAO;
import com.softwareControl.Model.Teacher;
import com.softwareControl.Service.interfaces.TeacherServiceInter;

//配置这个注解用处是让spring的事务管理器接管该service的所有事务
@Transactional
public class TeacherService implements TeacherServiceInter{
	
	private TeacherDAO teacherdao;
	

	/*private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		System.out.println("setsessionFactory");
	}*/

	public TeacherDAO getTeacherdao() {
		return teacherdao;
	}

	public void setTeacherdao(TeacherDAO teacherdao) {
		this.teacherdao = teacherdao;
	}

	@Override
	public String addTeacher(Teacher teacher) {
		try{
			teacherdao.save(teacher);
			return "yes";
		}catch (Exception e) {
			e.printStackTrace();
			return "no";
		}
	}

	@Override
	public List<Teacher> showTeacher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher findbyId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delTeacher(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
