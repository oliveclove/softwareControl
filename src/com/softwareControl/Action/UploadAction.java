package com.softwareControl.Action;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.softwareControl.Dao.FileDAO;
import com.softwareControl.Model.Teacher;

public class UploadAction implements Action {
	private FileDAO filedao;
	
	public FileDAO getFiledao() {
		return filedao;
	}

	public void setFiledao(FileDAO filedao) {
		this.filedao = filedao;
	}

	private File uploadfile;
	private String uploadfileFileName;          // ��ȡ�ϴ��ļ�������
	private String uploadfileContentType;       //��ȡ�ļ�������

	
	public String getUploadfileContentType() {
		return uploadfileContentType;
	}

	public void setUploadfileContentType(String uploadfileContentType) {
		this.uploadfileContentType = uploadfileContentType;
	}

	public String getUploadfileFileName() {
		return uploadfileFileName;
	}

	public void setUploadfileFileName(String uploadfileFileName) {
		this.uploadfileFileName = uploadfileFileName;
	}

	public File getUploadfile() {
		return uploadfile;
	}

	public void setUploadfile(File uploadfile) {
		this.uploadfile = uploadfile;
	}

	@Override
	public String execute() throws Exception {
		Date date=new Date();
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		Teacher tea=(Teacher) ServletActionContext.getRequest().getSession().getAttribute("teacher");
		String name=tea.getTname();
		// �����ϴ��ļ�Ŀ¼
		String realpath = ServletActionContext.getServletContext().getRealPath("/upload");
		System.out.println(realpath);
		// �ж��ϴ��ļ��Ƿ�Ϊ��
		if (uploadfile != null) {
			File savefile = new File(realpath, uploadfileFileName);
			//�ж��ϴ�Ŀ¼�Ƿ����
			if (!savefile.getParentFile().exists()){
				savefile.getParentFile().mkdirs();
			}
			com.softwareControl.Model.File file=new com.softwareControl.Model.File();
			file.setFname(uploadfileFileName);
			file.setFowner(name);
			file.setFurl(realpath);
			file.setFdate(sqldate);
			filedao.save(file);
			FileUtils.copyFile(uploadfile, savefile);
			ActionContext.getContext().put("message", "�ϴ��ɹ���");
			return "ok";
		}
		return null;
	}
	
}

