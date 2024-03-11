package com.campus.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.campus.mapper.ApplyJobs;
@Repository
public class ApplicationDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public boolean applyJob(boolean status, long studentId, long jobID) {
		
		String sql = "insert into application(apply_status, student_id , job_id) values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, status,studentId,jobID );
		return result == 1;
	}
	
	public List<ApplyJobs> getApplyJob(long studentId) {
		
		
		String sql = "select j.job_title ,a.id as applyid , c.company_name, j.college_location from company_info c, job_posting j, application a where c.id = j.company_id and j.id= a.job_id and a.student_id =?";
		
		List<ApplyJobs> appliedJobs = jdbcTemplate.query(sql, new BeanPropertyRowMapper(ApplyJobs.class), studentId);
		return appliedJobs;
	}
	
	
	public boolean cancelApply(long applyId) {
		String sql ="delete from application where id = ?";
		
		int result = jdbcTemplate.update(sql,applyId);
		return result == 1;
	}

}
