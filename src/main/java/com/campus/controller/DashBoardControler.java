package com.campus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.campus.model.Student;

@Controller
public class DashBoardControler {
	
//	@GetMapping("/studentdashboard")
//	public ModelAndView showDashBoard(HttpSession session) {
//		ModelAndView mv = new ModelAndView ();
//		System.out.println("Session page");
//		Student loggedStudent   = (Student) session.getAttribute("result");
//		
//		if(loggedStudent != null ) {
//			mv.addObject("result", loggedStudent);
//			mv.setViewName("studentdashboard");
//			
//			
//		}else {
//			mv.addObject("result","invalid cruditials");
//			mv.setViewName("login");
//			
//		}
//		return mv;
//	
//		
//	}

}
