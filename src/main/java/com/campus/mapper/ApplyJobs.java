package com.campus.mapper;

public class ApplyJobs {
	private long id;
	private String  jobTitle ;
	private String companyName;
	private String collegeLocation;
	private long applyId;
	
	
	
	public long getApplyId() {
		return applyId;
	}
	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}
	@Override
	public String toString() {
		return "ApplyJobs [id=" + id + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", collegeLocation="
				+ collegeLocation + ", applyId=" + applyId + "]";
	}
	
}
