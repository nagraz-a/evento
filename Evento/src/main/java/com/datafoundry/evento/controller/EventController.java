package com.datafoundry.evento.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.datafoundry.evento.model.Event;
import com.datafoundry.evento.service.EventService;

@RestController
@RequestMapping("/api/event")
public class EventController 
{
	//Autowired is used for connection between two classes//
		@Autowired
		  private EventService service;
		  
		  @RequestMapping(value = "/", method = RequestMethod.GET)
		  public List<Event> getAllEvent()
		  {
		    return service.findAll();
		  }
		  
		  @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
		  public Event getEventById(@PathVariable("id") String id)
		  {
			return service.findByid(id);
		  }
		  
		  @RequestMapping(value = "/eventByTitle/{title}", method = RequestMethod.GET)
		  public Event getEventByTitle(@PathVariable("title") String title) 
		  {
			return service.findBytitle(title);
		  }
		  
		  @GetMapping("/getEventByUser/{id}")
		  public List<Event> getEventbyUser(@PathVariable String id)
		  {
				return service.findByUserid(id);
		  }

		  @GetMapping("/getEventByvenue/{city}")
		  public List<Event> getEventbyvenue(@PathVariable String city)
		  {
			  return service.findByCity(city);
		  }	  
		  
		  	  
		  @RequestMapping(value = "/", method = RequestMethod.POST)
		  public Event createEvent(@Valid @RequestBody Event event) {
		    service.save(event);
		    return event;
		  }

}
