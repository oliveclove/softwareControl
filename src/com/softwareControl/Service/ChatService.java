package com.softwareControl.Service;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.softwareControl.Dao.ChatDAO;
import com.softwareControl.Model.Chat;
import com.softwareControl.Service.interfaces.ChatServiceInter;

public class ChatService implements ChatServiceInter{
	
	private ChatDAO chatdao;
	
	
	public ChatDAO getChatdao() {
		return chatdao;
	}

	public void setChatdao(ChatDAO chatdao) {
		this.chatdao = chatdao;
	}

	@Override
	public String addContent(Chat chat) {
		try{
			chatdao.save(chat);
			return "yes";
		}catch (Exception e) {
			e.printStackTrace();
			return "no";
		}
	}

	@Override
	public List<Chat> showall() {
		try{
			@SuppressWarnings("unchecked")
			List<Chat> list=chatdao.findAll();
			System.out.println(list.size());
			if(list.size()!=0){
				ServletActionContext.getRequest().setAttribute("chatlist", list);
				return list;
			}
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
