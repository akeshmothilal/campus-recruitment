package com.campus.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.campus.mapper.CompanyProfile;
import com.campus.model.Company;
import com.campus.model.Student;
import com.campus.service.CompanyService;

@Controller
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@GetMapping("/companylogin")
	public String companyLogin() {
		return "company_login";
	}

	@GetMapping("/showcompanyregister")
	public String companyRegistration() {
		return "company_registration";
	}

	@PostMapping("/companyregister")
	public ModelAndView companyRegister(@ModelAttribute Company company, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		boolean result = companyService.companyRegister(company);
		Company companyLogin = companyService.companyLogin(company);
		if (result) {
			session.setAttribute("logedCompany", companyLogin);
			mv.setViewName("redirect:/companydashboard");
//			mv.addObject("result", "sussfully regisreed");
//			mv.setViewName("company_dashboard");
		} else {
			mv.addObject("error", "somethong went wrong");
			mv.setViewName("redirect:/company_registration");
		}
		return mv;

	}

	@PostMapping("/companylogin")
	public ModelAndView companyLogin(@ModelAttribute Company company, HttpSession session) {
		ModelAndView mv = new ModelAndView();

		Company logedCompany = companyService.companyLogin(company);

		if (logedCompany != null) {
			session.setAttribute("logedCompany", logedCompany);
			mv.setViewName("redirect:/companydashboard");

		} else {
			mv.addObject("error", "invalid cruditials");
			mv.setViewName("company_login");
		}
		return mv;

	}

	@GetMapping("/companydashboard")
	public ModelAndView companyDashboard(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		Company loggedComapny = (Company) session.getAttribute("logedCompany");
		if (loggedComapny != null) {
			mv.addObject("loggedComapny", loggedComapny);
			List<Student> studentList = companyService.getallStudent();
			mv.addObject("studentList", studentList);

			mv.setViewName("company_dashboard");
		}

		else {
			mv.addObject("error", "invalid cruditials");
			mv.setViewName("company_login");

		}
		return mv;

	}

	@GetMapping("/companyprofile")
	public ModelAndView companyProfile(@RequestParam long companyID, HttpSession session) {

		ModelAndView mv = new ModelAndView();
		Company loggedComapny = (Company) session.getAttribute("logedCompany");
		if (loggedComapny != null) {

			List<CompanyProfile> appliedStudent = companyService.getAllApplliedJobs(companyID);
			System.out.println("applied student  is " + appliedStudent);
			mv.addObject("appliedStudent", appliedStudent);
			mv.setViewName("company_profile");
		}

		return mv;

	}

	@GetMapping("/companylogout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/companylogin";

	}

}
