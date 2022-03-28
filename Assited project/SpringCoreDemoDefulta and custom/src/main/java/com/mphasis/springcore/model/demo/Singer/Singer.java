package com.mphasis.springcore.model.demo.Singer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Singer {
	@Value("1011")
	private String sid;
	@Value("raham")
	private String sname;
	@Autowired
	@Qualifier("violin")
	private Insturment Insturment;
	
	public Singer () {
		
	}
	
	public void singing() {
		System.out.println("raham is singing");
		Insturment.play();
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Insturment getInsturment() {
		return Insturment;
	}

	public void setInsturment(Insturment insturment) {
		Insturment = insturment;
	}

	@Override
	public String toString() {
		return "Singer [sid=" + sid + ", sname=" + sname + ", Insturment=" + Insturment + "]";
	}

	public Singer(String sid, String sname, com.mphasis.springcore.model.demo.Singer.Insturment insturment) {
		super();
		this.sid = sid;
		this.sname = sname;
		Insturment = insturment;
	}
	
	
}