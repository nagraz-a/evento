package com.datafoundry.evento.event;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
	
	@RequestMapping("/hello.....")
	public String sayHi() {
		return "Welcome to Evento";
	}
}
