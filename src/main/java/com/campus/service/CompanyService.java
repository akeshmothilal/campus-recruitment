package com.campus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.campus.mapper.CompanyProfile;
import com.campus.model.Company;
import com.campus.model.Student;
import com.campus.repository.CompanyDAO;

@Service
public class CompanyService {
	@Autowired
	private CompanyDAO comapnyDAO;
	
	
	public boolean companyRegister(Company company) {
		return comapnyDAO.comapnyRegistration(company);
	}
	
	public Company companyLogin(Company company) {
		return comapnyDAO.comapnyLogin(company);
	}
	
	public List<Student> getallStudent (){
		
		
		return comapnyDAO.getallStudent();
	}
	
public List<CompanyProfile> getAllApplliedJobs(long companyId){
		
		return comapnyDAO.getAllApplliedJobs(companyId);
	}

         
	
	
}
