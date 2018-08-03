package com.report.CATToolApplication.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.CATToolApplication.Entity.Application;
import com.report.CATToolApplication.Entity.AssessmentQuestions;
import com.report.CATToolApplication.Repository.AssessmentQuestionsRepository;

@RestController
@RequestMapping("/assessmentQuestions")
public class AssessmentController {
	@Autowired
	AssessmentQuestionsRepository assessmentQuestionsRepository;
	
	 @GetMapping("/getAssessment")
		public String getuser() {
			return "Welcome to Assessment question controller!!!!!";
			
	  }
	 
	 @GetMapping("/getAllAssessmentQuestions")
	 public List<AssessmentQuestions> getAssessmetQuestions(){
		 return assessmentQuestionsRepository.findAll();
	 }
	 
	 @RequestMapping("/addAssessmentQuestion")
	 public String addAssessmentQuestion(@RequestBody AssessmentQuestions assessmentQuestionFromUI){
		 if(assessmentQuestionsRepository.save(assessmentQuestionFromUI)!=null)
		 {
			 return "Assessment Questions saved";
		 }
		 else
		 {
			 return "Assessment Questions not saved";
		 }
		 
	 }
}
