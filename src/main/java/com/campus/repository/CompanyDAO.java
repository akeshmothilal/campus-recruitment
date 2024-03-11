package com.campus.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.campus.mapper.CompanyProfile;
import com.campus.model.Company;
import com.campus.model.Student;

@Repository
public class CompanyDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean comapnyRegistration(Company company) {
		String sql = "insert into company_info (company_name, company_type, headquarters, email, company_password ) values (?, ?, ?, ?, ?)";
		Object[] companyValues = { company.getCompanyName(), company.getCompanyType(), company.getHeadquarters(),
				company.getEmail(), company.getCompanyPassword() };

		int result = jdbcTemplate.update(sql, companyValues);
		return result == 1;

	}
	
	
	
	public Company comapnyLogin(Company company) {
		
		try {
			String sql = "select * from company_info where company_name = ? and company_password = ? ";
			
			Company companyResult  = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Company>(Company.class), company.getCompanyName(), company.getCompanyPassword());
			return companyResult;

			
		}
		catch(EmptyResultDataAccessException ex) {
			return null;
		}
	}
	
	public List<Student> getallStudent (){
		String sql = "select * from student_info order by percentage desc";
		List<Student> getAllStudent = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
		return getAllStudent;
	}
	
	public List<CompanyProfile> getAllApplliedJobs(long companyId){
		
		String sql = "select j.job_title ,s.user_name , c.company_name,s.id as student_id from job_posting j, company_info c, application a, student_info s where j.company_id = c.id and j.id = a.job_id and a.student_id = s.id and j.company_id = ?";
		List<CompanyProfile> appliedJobs = jdbcTemplate.query(sql, new BeanPropertyRowMapper(CompanyProfile.class),companyId);
		return appliedJobs;
	}

}
