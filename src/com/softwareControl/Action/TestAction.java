package com.softwareControl.Action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class TestAction {
	@Resource 
	public String execute(){
		return "list";
	}
}
