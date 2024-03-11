package com.campus.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.campus.mapper.Vacancy;
import com.campus.model.Student;

@Repository
public class StudentDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	
	
	public boolean studentRegister(Student student) {
		String sql ="insert into student_info(user_name, gender, dateOfBirth, college, course, percentage, role , user_password, email  , contact_no)values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] stuentValues = {student.getUserName(), student.getGender(), student.getDateOfBirth(), student.getCollege(), student.getCourse(), student.getPercentage(), student.getRole(), student.getUserPassword(), student.getEmail(), student.getContactNo()};
		
		int result = jdbcTemplate.update(sql, stuentValues);
		
		return result==1;
	}
	
	public Student studentLogin(Student student){
		
		
		try {
			String sql = "select * from student_info where user_name = ? and user_password =?";
			
			Student studentResult = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Student>(Student.class), student.getUserName(), student.getUserPassword());
			return studentResult;
			
		}catch(EmptyResultDataAccessException ex) {
			return null;
		}
		
	
		
	}

}
