package com.datafoundry.evento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datafoundry.evento.model.Event;
import com.datafoundry.evento.model.User;
import com.datafoundry.evento.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<User> getAllUser()
	  {
	    return service.findAll();
	  }
	
	@PostMapping("/saveuser")
	public String saveUser(@RequestBody String first_name) {
		service.save(first_name);
		return "User Saved Sucessfully........";
		}

//	@PostMapping("/saveuser")
//	public String saveUser(@RequestBody User user) {
//		service.save(user);
//		return "User Saved Sucessfully........";
//		}
	
	
	@GetMapping("/getUser/{email}")
	public User getUserbyEmail(@PathVariable String email){
		return service.findByEmail(email);
	}

	
	@GetMapping("/getUserByAddress/{state}")
	public List<User> getUserbyAddress(@PathVariable String state){
		return service.findBystate(state);
	}
	
	@GetMapping("/getUserByCity/{city}")
	public List<User> getUserbyCity(@PathVariable String city){
		return service.findBycity(city);
	}

	
	@GetMapping("/getlogin/{email}/{password}")
	   public String getUserBylogin(@PathVariable String email,@PathVariable String password) {
		User user=service.findByEmail(email);

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

