package com.campus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.campus.model.Admin;
import com.campus.repository.AdminDAO;

@Service
public class AdminService {
	@Autowired
	private AdminDAO adminDAO;

public Admin adminLogin(Admin admin) {
return adminDAO.adminLogin(admin);
	

}
}
