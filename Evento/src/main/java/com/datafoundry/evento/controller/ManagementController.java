package com.datafoundry.evento.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datafoundry.evento.model.Management;
import com.datafoundry.evento.repository.ManagementRepository;


@RestController
@RequestMapping("/api/collection9")
public class ManagementController
{
	@Autowired
	  private ManagementRepository repository;
	  
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Management> getAllManagement() {
	    return repository.findAll();
	  }
	  @RequestMapping(value = "/{eventTitle}", method = RequestMethod.GET)
	  public Management getManagementByEventTitle(@PathVariable("eventTitle") String eventTitle) {
		return repository.findByeventTitle(eventTitle);
	  }

	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public Management createManagement(@Valid @RequestBody Management management) {
	   // animal.setName(String.get());
	    repository.save(management);
	    return management;
	  }
	  @RequestMapping(value = "/{eventTitle}", method = RequestMethod.DELETE)
	  public void deleteManagement(@PathVariable String eventTitle) {
	    repository.delete(repository.findByeventTitle(eventTitle));
	  }
}
