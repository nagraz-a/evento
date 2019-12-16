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
import com.datafoundry.evento.model.EventFeedback;
import com.datafoundry.evento.service.EventFeedbackService;

@RestController
@RequestMapping("/EventFeedback")
public class EventFeedbackController {

	@Autowired
	private EventFeedbackService service;
	
	@PostMapping("/createEventFeedback")
	public String sav(@RequestBody EventFeedback feedback) {
	service.save(feedback);
	return "saved successfully";
	}
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<EventFeedback> getAllFeedback(){
		return service.findAll();
	}
	
	@GetMapping("/getEventFeedbackById/{id}")
	public EventFeedback getEventFeedbackbyId(@PathVariable String id) {
		return service.findByid(id);
	}
	
	@GetMapping("/getEventfeedbackByParticipantId/{participants}")
	public List<EventFeedback> getEventFeedbackByUser(@PathVariable String participants) {
		return service.findByUser(participants);
	}
	
	@GetMapping("/getEventFeedbackByEventId/{event}")
	public List<EventFeedback> getEventFeedbackByEvent(@PathVariable String event) {
		return service.findByEvent(event);
	}
}
