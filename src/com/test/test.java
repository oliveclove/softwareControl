package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softwareControl.Model.Teacher;
import com.softwareControl.Service.TeacherService;
import com.softwareControl.Service.interfaces.TeacherServiceInter;

public class test {
	public static void main(String[] agrs){
		//@SuppressWarnings("resource")
		/*ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sf=(SessionFactory) ac.getBean("sessionFactory");
		Session s=sf.openSession();
		Transaction transaction=s.beginTransaction();*/
		/*s.save(teacher);
		transaction.commit();
		s.close();*/
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherServiceInter tea=(TeacherServiceInter) ac.getBean("teacherservice");
		Teacher teacher=new Teacher();
		teacher.setTid(1);
		teacher.setTname("1");
		teacher.setTage(1);
		teacher.setTsex("ÄÐ");
		teacher.setTposition("²©Ê¿");
		teacher.setTemail("123");
		teacher.setTtel("123456");
		teacher.setTpassword("123456");
		tea.addTeacher(teacher);
		
		List<Teacher> list=tea.showTeacher();
		for(Teacher tea1:list){
			System.out.println(tea1.getTname());
		}
		
		Teacher teacher2=tea.findbyId();
		System.out.println(teacher2.getTname());
	}
}
