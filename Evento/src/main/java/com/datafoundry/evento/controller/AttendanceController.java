package com.datafoundry.evento.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datafoundry.evento.model.Event;
import com.datafoundry.evento.model.EventRegistration;
import com.datafoundry.evento.service.EventRegistrationService;
import com.datafoundry.evento.service.EventService;
import com.datafoundry.evento.service.UserService;


@RestController
@RequestMapping("/attendance")
public class AttendanceController 
{
	@Autowired
	private UserService userService;
		
	@Autowired
	private EventService eventService;
	
	@Autowired
	private EventRegistrationService eventRegistartionService;
	
	
	@GetMapping("/getAttendanceByEventId")
	public List<Event> getAllEvent()
	  {
	    return eventService.findAll();
	  }
	  
	
	@GetMapping("/getAttendanceByEventRegistrationId")
	public List<EventRegistration> getAllEventRegistration(){
		return eventRegistartionService.findAll();
	}
	
	@PutMapping("/createAttendance/{id}")
	public void updateAttendance(@PathVariable("id") String id, @Valid @RequestBody EventRegistration eventRegistration) {
		eventRegistration.setId(id);
		eventRegistartionService.save(eventRegistration);
	//return " Attendace saved successfully";
	}
	
	 	  
}
	


