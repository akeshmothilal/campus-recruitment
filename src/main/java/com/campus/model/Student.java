package com.campus.model;

public class Student {
	private long id;
	private String userName;
	private String gender;
	private String dateOfBirth;
	private String college;
	private String course;
	private String userPassword;
	private String email;
	private String role;
	private long contactNo;
	
	private long percentage;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String password) {
		this.userPassword = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getPercentage() {
		return percentage;
	}
	public void setPercentage(long percentage) {
		this.percentage = percentage;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", userName=" + userName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", college=" + college + ", course=" + course + ", userPassword=" + userPassword + ", email=" + email
				+ ", role=" + role + ", contactNo=" + contactNo + ", percentage=" + percentage + "]";
	}
	

	
	
	

}
