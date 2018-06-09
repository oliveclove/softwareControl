package com.softwareControl.Action;

import java.sql.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.softwareControl.Model.Chat;
import com.softwareControl.Model.Teacher;
import com.softwareControl.Service.ChatService;

public class ChatAction implements Action{
	
	private ChatService chatService;
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ChatService getChatService() {
		return chatService;
	}

	public void setChatService(ChatService chatService) {
		this.chatService = chatService;
	}

	@Override
	public String execute() throws Exception {
		try{
			List<Chat> list=chatService.showall();
			if(list.size()!=0){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
	
	public String add() throws Exception{
		try{
			Teacher tea=(Teacher) ServletActionContext.getRequest().getSession().getAttribute("teacher");
			String name=tea.getTname();
			java.util.Date date=new java.util.Date();
			Date sqldate=new Date(date.getTime());
			System.out.println(sqldate);
			Chat chat=new Chat();
			chat.setChowner(name);
			chat.setChdate(sqldate);
			chat.setChcontent(content);
			String result=chatService.addContent(chat);
			if(result.equals("yes")){
				return "ok";
			}
			return "err";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
}
