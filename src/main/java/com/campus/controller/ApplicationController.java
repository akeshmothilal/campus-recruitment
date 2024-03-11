package com.campus.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.campus.mapper.ApplyJobs;
import com.campus.model.Student;
import com.campus.service.ApplicationService;

@Controller
public class ApplicationController {
@Autowired
	private ApplicationService applicationService;

	@GetMapping("/apply")
	public ModelAndView apply(@RequestParam boolean status, @RequestParam long studentId, @RequestParam long jobId,
			HttpSession session) {
		System.out.println(status + " " + studentId + "  " + jobId);
		ModelAndView mv = new ModelAndView();
		Student loggedStudent = (Student) session.getAttribute("result");
		System.out.println(loggedStudent);
		if (loggedStudent != null) {
			boolean result = applicationService.applyJob(status, studentId, jobId);
			mv.addObject("loggedStudent", loggedStudent);
			List<ApplyJobs> appliedJobs =  applicationService.getApplyJob(loggedStudent.getId());
			System.out.println("appliedJobs "+appliedJobs);
			mv.addObject("appliedJobs", appliedJobs);
			mv.setViewName("student_profile");

		}
		return mv;

	}
	
	
	@GetMapping("/cancelapply")
	
	public ModelAndView cancelApply(@RequestParam long applyId,HttpSession session) {
		System.out.println(applyId);
		ModelAndView mv = new ModelAndView();
		boolean cancelJob = applicationService.cancelApply(applyId);
		Student loggedStudent = (Student) session.getAttribute("result");
		System.out.println(loggedStudent);
		if (cancelJob) {
			System.out.println(cancelJob);
			mv.addObject("loggedStudent", loggedStudent);
			List<ApplyJobs> appliedJobs =  applicationService.getApplyJob(loggedStudent.getId());
			System.out.println("appliedJobs "+appliedJobs);
			mv.addObject("appliedJobs", appliedJobs);
			mv.setViewName("student_profile");

		}
		return mv;
		
		
	}

}
