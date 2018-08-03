package com.report.CATToolApplication.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.CATToolApplication.Entity.Application;
import com.report.CATToolApplication.Entity.AssessmentQuestions;
import com.report.CATToolApplication.Entity.Users;
import com.report.CATToolApplication.Exception.CATToolApplicationException;
import com.report.CATToolApplication.Repository.ApplicationRepository;
import com.report.CATToolApplication.Repository.AssessmentQuestionsRepository;
import com.report.CATToolApplication.Repository.UserRepository;


@RestController
@RequestMapping("")
public class CATToolController {
	@Autowired
	AssessmentQuestionsRepository assessmentQuestionsRepository;
	
	@Autowired
	ApplicationRepository applicationRepository;
	
	@Autowired
	UserRepository userRepository;
	
	 @GetMapping("")
		public String getuser(ModelMap model) {
		    model.addAttribute("title","hii");
			return "CAT Tool Application!!!!!!!!!!!!!";
			
	  }
	 
	 @GetMapping("/assessmentQuestions")
	 public List<AssessmentQuestions> getAssessmetQuestions(){
		 return assessmentQuestionsRepository.findAll();
	 }
	 
	 @GetMapping("/applications")
	 public List<Application> getApplications() {
		return applicationRepository.findAll();
	 }
	 
	 @PostMapping("/usersByUsername")
	 public Users usersByUsername(@RequestBody Users usernameFromUI) {
		 Users userFromDatabase=new Users();
		 userFromDatabase=userRepository.findByUsername(usernameFromUI.getUsername());
		
			System.out.println(usernameFromUI.toString());
			 if(usernameFromUI.getUsername().equals(userFromDatabase.getUsername()) && usernameFromUI.getPassword().equals(userFromDatabase.getPassword()))
			 {
				 System.out.println("Password Match");
				 return userRepository.findByUsername(usernameFromUI.getUsername());
			 }
			 else
			 {
				 System.out.println("data does not match");
			 }
		
		return null;
	 }
	 @RequestMapping("/getAllUsers")
	 public List<Users> getAllUsers(){
		 String username="john";
		 String password="Cg@123";
		 Users user=new Users();
		 user=userRepository.findByUsername(username);
		
			if(username.equals(user.getUsername())&&password.equals(user.getPassword()))
			 {
				 System.out.println("Password Match");
				 return userRepository.findAll();
			 }
			 else
			 {
				 System.out.println("data does not match");
		}
		return null;
	 }
	 
	 @GetMapping("/users")
	 public List<Users> getUsers() {
		return userRepository.findAll();
	 }
}
