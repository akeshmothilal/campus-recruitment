package com.campus.model;

public class JobPosting {
	private long id;
	private String jobTitle;
	private String jobDescription;
	private String collegeLocation;
	private double salary;
	public String interviewDate;

	private long companyID;

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getCompanyID() {
		return companyID;
	}

	public void setCompanyID(long companyID) {
		this.companyID = companyID;
	}

	@Override
	public String toString() {
		return "JobPosting [id=" + id + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription
				+ ", collegeLocation=" + collegeLocation + ", salary=" + salary + ", companyID=" + companyID + "]";
	}

}
