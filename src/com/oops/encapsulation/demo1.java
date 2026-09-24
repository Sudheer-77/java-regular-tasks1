package com.oops.encapsulation;
class student {
	private String name;
	private int number;
	private String branch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}
public class demo1
{
	public static void main ( String args[])
	{
		student s= new student();
		s.setName("sudheer");
		s.setBranch("cse");
		s.setNumber(539);
		System.out.println(s.getBranch());
		System.out.println(s.getName());
		System.out.println(s.getNumber());
		
	}
}