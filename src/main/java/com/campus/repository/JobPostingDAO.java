package com.campus.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.campus.mapper.Vacancy;
import com.campus.model.JobPosting;

@Repository
public class JobPostingDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean createJob(JobPosting job) {
		String sql = "insert into job_posting(job_title, job_description,  college_location, salary, company_id, interview_date) values(?, ?, ?,?, ?,?)";
		Object[] jobValues = { job.getJobTitle(), job.getJobDescription(), job.getCollegeLocation(), job.getSalary(),
				job.getCompanyID(), job.getInterviewDate()};
		int jobResult = jdbcTemplate.update(sql, jobValues);
		return jobResult == 1;

	}
	
	public List<Vacancy> getAllVacancy(){
		String sql = "select c.company_name, j.job_title,j.job_description, c.email, j.college_location ,  j.interview_date ,j.id as job_id from company_info c, job_posting  j where c.id=j.company_id";
		
		
		List<Vacancy> vacancyList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Vacancy>(Vacancy.class));
		return vacancyList;
		
	}

}
