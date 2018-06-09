package com.softwareControl.Service;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.softwareControl.Dao.RenwuDAO;
import com.softwareControl.Model.Renwu;
import com.softwareControl.Service.interfaces.RenwuServiceInter;

public class RenwuService implements RenwuServiceInter{

	private RenwuDAO renwudao;
	
	public RenwuDAO getRenwudao() {
		return renwudao;
	}

	public void setRenwudao(RenwuDAO renwudao) {
		this.renwudao = renwudao;
	}

	@Override
	public List<Renwu> showall() {
		try{
			@SuppressWarnings("unchecked")
			List<Renwu> list=renwudao.findAll();
			if(list.size()!=0){
				ServletActionContext.getRequest().setAttribute("renwulist", list);
				return list;
			}
			return null;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String add(Renwu rewu) {
		try{
			renwudao.save(rewu);
			return "yes";
		}catch (Exception e) {
			e.printStackTrace();
			return "no";
		}
	}
	
}
