package com.datafoundry.evento.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/createFeedback")
	public String sav(@RequestBody EventFeedback feedback) {
	service.save(feedback);
	return "saved successfully";
	}
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<EventFeedback> getAllFeedback(){
		return service.findAll();
	}
}
