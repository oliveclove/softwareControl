package com.softwareControl.Service;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.softwareControl.Dao.GroupsDAO;
import com.softwareControl.Model.Groups;
import com.softwareControl.Service.interfaces.GroupServiceInter;

public class GroupService implements GroupServiceInter{

	private GroupsDAO groupdao;
	
	public GroupsDAO getGroupdao() {
		return groupdao;
	}

	public void setGroupdao(GroupsDAO groupdao) {
		this.groupdao = groupdao;
	}

	@Override
	public List<Groups> showall() {
		try{
			List<Groups> list=groupdao.findAll();
			System.out.println(list);
			if(list.size()!=0){
				for(Groups groups:list){
					System.out.println(groups.getGname());
				}
				ServletActionContext.getRequest().setAttribute("grouplist", list);
				return list;
			}
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Groups findbyName(String gname) {
		try{
			List<Groups> list=groupdao.findAll();
			if(list.size()!=0){
				for(Groups group:list){
					if(group.getGname().equals(gname)){
						ServletActionContext.getRequest().setAttribute("group", group);
						return group;
					}
				}
			}
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
