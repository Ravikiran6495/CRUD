package com.hefshine.bean;

public class Student {

	private int rollnumber;
	private String firstname;
	private String lastname;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(int rollnumber) {
		this.rollnumber = rollnumber;
	}



	public Student(int rollnumber, String firstname, String lastname) {
		super();
		this.rollnumber = rollnumber;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	
	
}
