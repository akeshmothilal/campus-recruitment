package com.campus.mapper;

public class Vacancy {
	private long id;
	private String companyName;
	
	private String jobTitle;
	private String jobDescription;
	private String collegeLocation;
	private String interviewDate;
	private String email;
	private long jobId;
	
	public long getJobId() {
		return jobId;
	}
	public void setJobId(long jobId) {
		this.jobId = jobId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}
	@Override
	public String toString() {
		return "Vacancy [id=" + id + ", companyName=" + companyName + ", jobTitle=" + jobTitle + ", jobDescription="
				+ jobDescription + ", collegeLocation=" + collegeLocation + ", interviewDate=" + interviewDate
				+ ", email=" + email + ", jobId=" + jobId + "]";
	}
	

	
}
