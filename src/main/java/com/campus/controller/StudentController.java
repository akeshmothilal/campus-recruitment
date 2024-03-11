package com.campus.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.campus.mapper.Vacancy;
import com.campus.model.Student;
import com.campus.service.JobPostingService;
import com.campus.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private JobPostingService jobPostingService;
	@GetMapping("/campus")
	public String showHomePage() {
System.out.println("welcome");
		return "index";
	}

	@GetMapping("/showregister")
	public String showRegistrationPage() {
		return "registration";
	}

	@PostMapping("/studentregister")
	public ModelAndView studnetRegister(@ModelAttribute Student student,HttpSession session) {
		ModelAndView mv = new ModelAndView();
		boolean studentResult = studentService.studentRegister(student);
		Student studentLogin = studentService.studentLogin(student);
		if (studentResult) {
			session.setAttribute("result", studentLogin);
			
			mv.setViewName("redirect:/studentdashboard");
		} else {
			mv.addObject("message", "you are not registred yet ! something went wrong");
			mv.setViewName("registration");
		}
		return mv;

	}

	@PostMapping("/studentlogin")
	public ModelAndView studnetLogin(@ModelAttribute Student student, HttpSession session) {
		System.out.println(student);
		ModelAndView mv = new ModelAndView();

		Student studentResult  = studentService.studentLogin(student);
		System.out.println(studentResult);
		if(studentResult != null) {
			session.setAttribute("result", studentResult);
			
			System.out.println(session.getCreationTime());
			mv.setViewName("redirect:/studentdashboard");
		}else {
			
			mv.addObject("error","invalid cruditials");
			mv.setViewName("index");
		
			
		}
		return mv;

	

	}
	
	

	@GetMapping("/studentdashboard")
	public ModelAndView showDashBoard(HttpSession session) {
		ModelAndView mv = new ModelAndView ();
		System.out.println("Session page");
		Student loggedStudent   = (Student) session.getAttribute("result");
		
		if(loggedStudent != null ) {
			mv.addObject("loggedStudent", loggedStudent);
			List<Vacancy> vacancyList=  jobPostingService.getAllVaccancy();
			mv.addObject("vacancyList", vacancyList);
			System.out.println("vacancyList is " +vacancyList);
			mv.setViewName("studentdashboard");
			
			
		}else {
			mv.addObject("error","invalid cruditials");
			mv.setViewName("redirect:/campus");
			
		}
		return mv;

}
	
	@GetMapping("/studentlogout")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mv  = new ModelAndView();
		session.invalidate();
		mv.setViewName("redirect:/campus");		
		return mv;
		
		
	}
}
