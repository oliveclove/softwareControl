package com.softwareControl.Service.interfaces;

import java.util.List;

import com.softwareControl.Model.Chat;

public interface ChatServiceInter {
	public String addContent(Chat chat);
	public List<Chat> showall();
}
