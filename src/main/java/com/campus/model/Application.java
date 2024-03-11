package com.campus.model;

public class Application {
	
	private long id;
	private long studentId;
	private long jobId;
	private  boolean status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getJobId() {
		return jobId;
	}
	public void setJobId(long jobId) {
		this.jobId = jobId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Application [id=" + id + ", studentId=" + studentId + ", jobId=" + jobId + ", status=" + status + "]";
	}
	

}
