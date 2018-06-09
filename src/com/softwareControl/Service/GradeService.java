package com.softwareControl.Service;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.softwareControl.Dao.GradeDAO;
import com.softwareControl.Model.Grade;
import com.softwareControl.Service.interfaces.GradeServiceInter;

public class GradeService implements GradeServiceInter{
	
	private GradeDAO gradedao;
	

	public GradeDAO getGradedao() {
		return gradedao;
	}

	public void setGradedao(GradeDAO gradedao) {
		this.gradedao = gradedao;
	}

	@Override
	public String addGrade(Grade grade) {
		try{
			gradedao.save(grade);
			return "yes";
		}catch (Exception e) {
			e.printStackTrace();
			return "no";
		}
	}

	@Override
	public Grade findbyName(String name) {
		try{
			@SuppressWarnings("unchecked")
			List<Grade> list=gradedao.findAll();
			System.out.println(list.size());
			if(list.size()!=0){
				for(Grade grade:list){
					if(grade.getSname().equals(name)){
						Grade g=grade;
						ServletActionContext.getRequest().setAttribute("g", g);
						return grade;
					}
				}
				return null;
			}
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Grade> showall() {
		try{
			@SuppressWarnings("unchecked")
			List<Grade> list=gradedao.findAll();
			if(list.size()!=0){
				ServletActionContext.getRequest().setAttribute("gradelist", list);
				return list;
			}
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String update(Grade grade) {
		// TODO Auto-generated method stub
		return null;
	}

}
