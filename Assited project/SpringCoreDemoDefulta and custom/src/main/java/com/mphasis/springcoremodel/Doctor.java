package com.mphasis.springcoremodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Doctor {
	@Value("1011")
	private int did;
	@Value("raham")
	private String dname;
	@Value("raham556")
	private String email;
	@Autowired
	private Patient patient;
 
	public  Doctor() {
		
	}
    
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", email=" + email + ", patient=" + patient + "]";
	}

	public Doctor(int did, String dname, String email, Patient patient) {
		super();
		this.did = did;
		this.dname = dname;
		this.email = email;
		this.patient = patient;
	}


}
