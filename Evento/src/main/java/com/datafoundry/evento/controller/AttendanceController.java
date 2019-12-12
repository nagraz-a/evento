package com.datafoundry.evento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	

}
