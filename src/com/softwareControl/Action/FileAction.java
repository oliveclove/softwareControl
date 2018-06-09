package com.softwareControl.Action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.softwareControl.Model.File;
import com.softwareControl.Service.FileService;

public class FileAction implements Action{
	private FileService fileservice;

	public FileService getFileservice() {
		return fileservice;
	}

	public void setFileservice(FileService fileservice) {
		this.fileservice = fileservice;
	}

	@Override
	public String execute() throws Exception {
		try{
			List<File> list=fileservice.showall();
			if(list.size()!=0){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
	
}
