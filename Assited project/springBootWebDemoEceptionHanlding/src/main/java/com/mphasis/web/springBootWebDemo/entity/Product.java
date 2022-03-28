package com.mphasis.web.springBootWebDemo.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
	private int pid;
	private String pname;
	@Size(min=10)
	private String descprition;
	private double price;
	 
	  public  Product () {
		  
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

	public String getDescprition() {
		return descprition;
	}

	public void setDescprition(String descprition) {
		this.descprition = descprition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", descprition=" + descprition + ", price=" + price + "]";
	}

	public Product(int pid, String pname, String descprition, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.descprition = descprition;
		this.price = price;
	}
	  

}
