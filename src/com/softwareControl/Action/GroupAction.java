package com.softwareControl.Action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.softwareControl.Model.Groups;
import com.softwareControl.Service.GroupService;

public class GroupAction implements Action{
	private GroupService groupService;

	public GroupService getGroupService() {
		return groupService;
	}

	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}
	
	private String gname;
	

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	@Override
	public String execute() throws Exception {
		try{
			List<Groups> list=groupService.showall();
			if(list.size()!=0){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
	
	public String findbyName() throws Exception{
		try{
			Groups groups=groupService.findbyName(gname);
			if(groups!=null){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
	
}
