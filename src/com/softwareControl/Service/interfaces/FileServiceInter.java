package com.softwareControl.Service.interfaces;

import java.util.List;

import com.softwareControl.Model.File;

public interface FileServiceInter {
	public List<File> showall();
	public String findbyName();
}
