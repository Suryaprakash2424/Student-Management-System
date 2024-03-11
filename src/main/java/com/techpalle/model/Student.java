package com.techpalle.model;

public class Student {
	private int sno;
	private String name;
	private String course;
	private String gender;
	private String email;
	private String education;
	public Student(int sno, String name, String course, String gender, String email, String education) {
		super();
		this.sno = sno;
		this.name = name;
		this.course = course;
		this.gender = gender;
		this.email = email;
		this.education = education;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
