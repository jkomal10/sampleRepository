package com.report.CATToolApplication.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.report.CATToolApplication.Entity.Application;
import com.report.CATToolApplication.Repository.ApplicationRepository;

@RestController
@RequestMapping("/application")
public class ApplicationController {
	@Autowired
	ApplicationRepository applicationRepository;
	
	 @GetMapping("/getApplication")
		public String getuser() {
			return "Welcome to Application Controller!!!!";
	  }
	 
	 @GetMapping("/getAllapplications")
	 public List<Application> getApplications() {
		return applicationRepository.findAll();
	 }
}
