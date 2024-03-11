package com.campus.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.campus.model.Admin;

@Repository
public class AdminDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Admin adminLogin(Admin admin) {
		try {
			String sql = "select * from admin where admin_name = ? and admin_password = ?";
			
			Admin adminResult = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Admin>(Admin.class), admin.getAdminName(), admin.getAdminPassword());
			return adminResult;
			
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
		
		
	}

}
