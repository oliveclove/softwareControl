package com.softwareControl.Action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UpdownAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1981810986248745878L;
	private String filename;
	private String contentType;
	private long contentlength;
	private InputStream inputStream;
	
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public long getContentlength() {
		return contentlength;
	}
	public void setContentlength(long contentlength) {
		this.contentlength = contentlength;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String execute() throws Exception {
		String filepath=ServletActionContext.getRequest().getServletContext().getRealPath("/upload/"+filename);
		inputStream=new FileInputStream(new File(filepath));
		filename=URLEncoder.encode(filename, "UTF-8");
		contentlength=inputStream.available();
		return SUCCESS;
	}
}
