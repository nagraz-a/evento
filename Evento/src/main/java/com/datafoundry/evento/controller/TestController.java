package com.datafoundry.evento.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datafoundry.evento.model.Test;
import com.datafoundry.evento.repository.TestRepository;

@RestController
@RequestMapping("/test")
public class TestController {
	private TestRepository repository;
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "Hello from test Controller";
	}

	@PostMapping("/add")
	public String addData(@RequestBody Test test)
	{
		repository.save(test);
		return "data Saved Sucessfully";
	}

}
