package com.murtaza.web.model;

public class AllienModel {
	private int id;
	private String name;
	private String tech;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "AllienDB [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
}
