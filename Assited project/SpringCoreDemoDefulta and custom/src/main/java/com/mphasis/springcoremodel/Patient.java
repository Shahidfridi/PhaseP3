package com.mphasis.springcoremodel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Patient {
	@Value("112")
	private int pid;
	@Value("ravi")
	private String pname;
	@Value("+Ave")
	private String bloodgroup;
	
	public Patient (){
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", bloodgroup=" + bloodgroup + "]";
	}

	public Patient(int pid, String pname, String bloodgroup) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.bloodgroup = bloodgroup;
	}
	
	

}
