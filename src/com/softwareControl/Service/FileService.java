package com.softwareControl.Service;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.softwareControl.Dao.FileDAO;
import com.softwareControl.Model.File;
import com.softwareControl.Service.interfaces.FileServiceInter;

public class FileService implements FileServiceInter{

	private FileDAO dao;
	
	public FileDAO getDao() {
		return dao;
	}

	public void setDao(FileDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<File> showall() {
		try{
			@SuppressWarnings("unchecked")
			List<File> list=dao.findAll();
			System.out.println(list.size());
			if(list.size()!=0){
				ServletActionContext.getRequest().setAttribute("filelist", list);
				return list;
			}
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String findbyName() {
		// TODO Auto-generated method stub
		return null;
	}

}
