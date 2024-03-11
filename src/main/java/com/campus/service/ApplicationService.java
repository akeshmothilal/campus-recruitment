package com.campus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.campus.mapper.ApplyJobs;
import com.campus.repository.ApplicationDAO;

@Service
public class ApplicationService {
	@Autowired
  private ApplicationDAO ApplicationDAO;
	
	public boolean applyJob(boolean status, long studentId, long jobId) {
		return ApplicationDAO.applyJob(status, studentId, jobId);
		
	}
public List<ApplyJobs> getApplyJob(long studentId) {
		
		
	return ApplicationDAO.getApplyJob(studentId);
	}

public boolean cancelApply(long applyId) {
	return ApplicationDAO.cancelApply(applyId);
}


}
