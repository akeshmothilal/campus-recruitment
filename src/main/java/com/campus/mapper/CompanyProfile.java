package com.campus.mapper;

public class CompanyProfile {
	
	private long id;
	private String jobTitle;
	private String userName;
	private String studentId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "CompanyProfile [id=" + id + ", jobTitle=" + jobTitle + ", userName=" + userName + ", studentId="
				+ studentId + "]";
	}
	

}
