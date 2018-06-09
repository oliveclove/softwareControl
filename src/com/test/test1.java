package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softwareControl.Model.Groups;
import com.softwareControl.Service.interfaces.GroupServiceInter;

public class test1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		GroupServiceInter group=(GroupServiceInter) ac.getBean("groupservice");
		group.showall();
		/*StudentService stu=(StudentService) ac.getBean("studentservice");
		List<Student> list=stu.showall();
		for(Student stu1:list){
			System.out.println(stu1.getSname());
		}*/
	}

}
