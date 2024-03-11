package com.campus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.campus.model.Admin;
import com.campus.model.User;
import com.campus.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	@GetMapping("/admin")
	public String showAdminLogin() {
		return "admin_login";
	}
	@PostMapping("/adminlogin")
	public ModelAndView adminLogin(@ModelAttribute Admin admin, HttpSession session) {
		
		ModelAndView mv = new ModelAndView();
		
		Admin loggedAdmin = adminService.adminLogin(admin);
		if(loggedAdmin != null) {
			session.setAttribute("loggedAdmin", loggedAdmin);
			mv.setViewName("redirect:/admindashboard");
		}else {
			mv.addObject("error", "invalid creational");
		}
		return mv;
		
		
	}
	@GetMapping("/admindashboard")
	public ModelAndView adminDashboard(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		Admin loggedAdmin = (Admin) session.getAttribute("loggedAdmin");
		if(loggedAdmin != null) {
			mv.setViewName("admin_dashboard");
		}
		return mv;
		
		
	}
	

}
