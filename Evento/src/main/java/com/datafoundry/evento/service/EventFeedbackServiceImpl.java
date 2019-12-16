package com.datafoundry.evento.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.datafoundry.evento.model.Event;
import com.datafoundry.evento.model.EventFeedback;
import com.datafoundry.evento.repository.EventFeedbackRepository;

@Service
public class EventFeedbackServiceImpl implements EventFeedbackService{

	@Autowired
	private EventFeedbackRepository repository;
	@Override
	public EventFeedback save(EventFeedback feedback) {
		return repository.save(feedback);
	}
	@Override
	public List<EventFeedback> findAll() {
		return repository.findAll();
	}
	@Override
	public EventFeedback findByEventTitle(String event_title) {
		return repository.findByEventTitle(event_title);
	}

	
}
