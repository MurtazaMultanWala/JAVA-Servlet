package com.murtaza;

public class Students {
	String name;
	int rollno;
	
	public Students(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", rollno=" + rollno + "]";
	}
	
	
}
