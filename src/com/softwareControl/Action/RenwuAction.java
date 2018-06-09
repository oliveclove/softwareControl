package com.softwareControl.Action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.softwareControl.Model.Renwu;
import com.softwareControl.Service.RenwuService;

public class RenwuAction implements Action{
	
	private RenwuService renwuservice;
	private String title;
	private String taker;
	private String begin;
	private String end;
	private String state;
	
	

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getTaker() {
		return taker;
	}


	public void setTaker(String taker) {
		this.taker = taker;
	}


	public String getBegin() {
		return begin;
	}


	public void setBegin(String begin) {
		this.begin = begin;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public RenwuService getRenwuservice() {
		return renwuservice;
	}


	public void setRenwuservice(RenwuService renwuservice) {
		this.renwuservice = renwuservice;
	}


	@Override
	public String execute() throws Exception {
		try{
			List<Renwu> list=renwuservice.showall();
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
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=sf.parse(begin);
		Date date2=sf.parse(end);
		java.sql.Date sqldate1=new java.sql.Date(date1.getTime());
		java.sql.Date sqldate2=new java.sql.Date(date2.getTime());
		try{
			Renwu renwu=new Renwu();
			renwu.setTitle(title);
			renwu.setTaker(taker);
			renwu.setBegindate(sqldate1);
			renwu.setEnddate(sqldate2);
			renwu.setJinqu(state);
			renwuservice.add(renwu);
			return "ok";
		}catch (Exception e) {
			e.printStackTrace();
			return "err";
		}
	}
}
