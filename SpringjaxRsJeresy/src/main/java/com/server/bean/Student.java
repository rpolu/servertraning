package com.server.bean;

public class Student {
	private int rollNum;
	private String name;
	private String marks;
	private String address;
	
	
	public Student(int rollNum, String name, String marks, String address) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
