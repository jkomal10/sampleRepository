package com.report.CATToolApplication.Controller;
import com.report.CATToolApplication.Entity.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.CATToolApplication.Repository.ApplicationRepository;
import com.report.CATToolApplication.Repository.AssessmentQuestionsRepository;


@RestController
@RequestMapping("/user")
public class CATToolController {
	@Autowired
	AssessmentQuestionsRepository assessmentQuestionsRepository;
	
	@Autowired
	ApplicationRepository applicationRepository;
	
	 @GetMapping("/getuser")
		public String getuser() {
			return "Hello world";
			
	  }
	 
	 @GetMapping("/assessmentQuestions")
	 public List<AssessmentQuestions> getAssessmetQuestions(){
		 return assessmentQuestionsRepository.findAll();
	 }
	 
	 @GetMapping("/applications")
	 public List<Application> getApplications() {
		return applicationRepository.findAll();
	 }
}
