package com.datafoundry.evento.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datafoundry.evento.model.EventRegistration;
import com.datafoundry.evento.service.EventRegistrationService;

@RestController
@RequestMapping("/eventregistration")
public class EventRegistrationController {
	
	@Autowired
	private EventRegistrationService service;
	
	@PostMapping("saveEventregistration")
	public String saveEventRegistration(@RequestBody EventRegistration eventregistration) {
	service.save(eventregistration);
	return "saved successfullyy";
	}
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<EventRegistration> getAllEventRegistration() {
	    return service.findAll();
	  }
	 
	@GetMapping("/geteventregistration/{id}")
	public EventRegistration getEventRegistrationbyId(@PathVariable String id){
		return service.findByid(id);
	}
	
	 @GetMapping("/geteventregistrationbyuserid/{user}")
	 public List<EventRegistration> getEventRegistrationByUser(@PathVariable String user) {
	return service.findByUser(user);
	 }
	 
//	 @GetMapping("/geteventregistrationbyeventid/{event}")
//	 public List<EventRegistration> getEventRegistrationByEvent(@PathVariable String event){
//		 return service.findByEvent(event);
//	 }
	 
//	 @GetMapping("/geteventregistrationbyuserideventid/{user}/{event}")
//	 public List<EventRegistration> getEventRegistrationByEventUser(@PathVariable String user,@PathVariable String event)
//	 return null;
//}
}

	

