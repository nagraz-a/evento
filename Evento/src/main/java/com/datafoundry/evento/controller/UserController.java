package com.datafoundry.evento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datafoundry.evento.model.User;
import com.datafoundry.evento.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/saveuser")
	public String saveUser(@RequestBody User user) {
		repository.save(user);
		return "User Saved Sucessfully........";
		
	}
	@GetMapping("/getUser/{email}")
	public User getUserbyEmail(@PathVariable String email){
		return repository.findByEmail(email);
	}
	@GetMapping("/getlogin/{email}/{password}")
	   public String getUserBylogin(@PathVariable String email,@PathVariable String password) {
		User user=repository.findByEmail(email);
	   if(user==null)
	   {
		   
		   return "Invalid Username or Password";   
		   
		    
	   }
	   
	   else if(user.getEmail().equals(email) && user.getPassword().equals(password) ) {
			   return "login is successfull";
		   }
	   return "login";
	}
}

