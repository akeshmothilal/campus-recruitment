package com.campus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.mapper.Vacancy;
import com.campus.model.JobPosting;
import com.campus.repository.JobPostingDAO;

@Service
public class JobPostingService {
	@Autowired
	private JobPostingDAO jobPostingDAO;
	
	public boolean createJobs(JobPosting job) {
		return jobPostingDAO.createJob(job);
		
	}
	public List<Vacancy> getAllVaccancy(){
		return jobPostingDAO.getAllVacancy();
	}


}
