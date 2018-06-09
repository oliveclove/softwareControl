package com.softwareControl.Action;

import com.opensymphony.xwork2.Action;
import com.softwareControl.Service.LoginService;

public class LoginAction implements Action{
	
	private LoginService loginservice;
	
	private String userid;
	private String password;
	private String role;
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public LoginService getLoginservice() {
		return loginservice;
	}
	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}
	
	@Override
	public String execute() throws Exception {
		int id=Integer.parseInt(userid);
		int flag=Integer.parseInt(role);
		if(flag==1){
			String result=loginservice.checkTeacher(id, password);
			System.out.println(result);
			if(result.equals("yes")){
				return "ok";
			}else{
				return "err";
			}
		}else if(flag==2){
			String result=loginservice.checkStudent(id, password);
			System.out.println(result);
			if(result.equals("yes")){
				return "ok2";
			}else{
				return "err";
			}
		}else if(flag==3){;
			String result=loginservice.checkAdmin(id, password);
			System.out.println(result);
			if(result.equals("yes")){
				return "ok3";
			}else{
				return "err";
			}
		}
		return "err";
	}
	
	
	
}
