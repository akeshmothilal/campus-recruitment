package com.campus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.campus.model.Company;
import com.campus.model.JobPosting;
import com.campus.service.JobPostingService;

@Controller
public class JobPostingController {
	@Autowired
	private JobPostingService jobPostingService;

	@GetMapping("/showcreatejob")
	public ModelAndView createJob(HttpSession session) {
		ModelAndView mv = new ModelAndView();

		Company company = (Company) session.getAttribute("logedCompany");
		System.out.println("data is " + company);
		mv.addObject("company", company);
		mv.setViewName("job_posting");
		return mv;
	}

	@PostMapping("/createjob")
	public ModelAndView createJob(@ModelAttribute JobPosting job, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		System.out.println("job is " + job);
		boolean jobResult = jobPostingService.createJobs(job);
		Company company = (Company) session.getAttribute("logedCompany");
		System.out.println("data is " + company);

		if (jobResult) {
			mv.addObject("company", company);
			mv.addObject("jobResult", "sussfully created your jobs for vaccancy ");
		} else {
			mv.addObject("jobResult", "someting went wrong ");
		}
		mv.setViewName("job_posting");
		return mv;
	}

}
