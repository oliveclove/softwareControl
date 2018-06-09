package com.softwareControl.Service.interfaces;

import java.util.List;

import com.softwareControl.Model.Groups;

public interface GroupServiceInter {
	public List<Groups> showall();
	public Groups findbyName(String gname);
}
