package com.report.CATToolApplication.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.report.CATToolApplication.Entity.Users;
import com.report.CATToolApplication.Exception.CATToolApplicationException;
import com.report.CATToolApplication.Repository.UserRepository;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	 @GetMapping("/getuser")
		public String getuser(ModelMap model) {
			return "Welcome to user controller!!!!!";
			
	  }
	 
	 @PostMapping("/getByUsername")
	 public Users usersByUsername(@RequestBody Users usernameFromUI) throws CATToolApplicationException{
		 Users userFromDatabase=new Users();
		 try {
		 userFromDatabase=userRepository.findByUsername(usernameFromUI.getUsername());
			 if(usernameFromUI.getUsername().equals(userFromDatabase.getUsername()) && usernameFromUI.getPassword().equals(userFromDatabase.getPassword()))
			 {
				 System.out.println("Password Match!!!!");
				 return userRepository.findByUsername(usernameFromUI.getUsername());
			 }
			 else
			 {
				 System.out.println("Password does not match!!!!!!");
			 }
		 }
		 catch(Exception e)
		 {
			 throw new CATToolApplicationException("Invalid Username");
		 }
		return null;
	 }
	 
	 @RequestMapping("/getAllUsers")
	 public List<Users> getAllUsers(){
		 return userRepository.findAll();
	 }
	 
	 @PostMapping("/addUsers")
	 public String addUsers(@RequestBody Users userFromUI){
		 userRepository.save(userFromUI);
		 if( userRepository.save(userFromUI)!=null)
		 {
			 return "user details saved";
		 }
		 else
		 {
			 return "user details not saved";
		 }
	 }
	 
}
