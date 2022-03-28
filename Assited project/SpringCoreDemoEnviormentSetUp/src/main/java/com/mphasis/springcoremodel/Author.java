package com.mphasis.springcoremodel;

public class Author {

	private int aid;
	private String aname;
	private String email;
	private String genre;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", email=" + email + ", genre=" + genre + "]";
	}

	public Author(int aid, String aname, String email, String genre) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.email = email;
		this.genre = genre;
	}
	
	
}
