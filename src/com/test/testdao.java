package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softwareControl.Model.Teacher;

public class testdao
{
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@SuppressWarnings("unchecked")
	public void print(){
		Session ss=sessionFactory.openSession();
		String hql="from Teacher";
		List<Teacher> list=(List<Teacher>) ss.createQuery(hql).list();
		for(Teacher teacher:list){
			System.out.println(teacher.getTid());
		}
	}
	public static void main(String args[]){
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		testdao test=(testdao) ac.getBean("testdao");
		test.print();
	}
}
