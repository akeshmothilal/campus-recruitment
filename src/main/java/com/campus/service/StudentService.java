package com.campus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.mapper.Vacancy;
import com.campus.model.Student;
import com.campus.repository.JobPostingDAO;
import com.campus.repository.StudentDAO;

@Service
public class StudentService {
	@Autowired
	private StudentDAO studentDAO;
	
	public boolean studentRegister(Student student) {
		return studentDAO.studentRegister(student);

	}

	public Student studentLogin(Student student) {

		Student st = studentDAO.studentLogin(student);
		if (st != null) {
			return st;
		} else {
			return null;
		}
	}
	
	


}
