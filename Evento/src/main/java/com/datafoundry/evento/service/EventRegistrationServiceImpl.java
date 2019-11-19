package com.datafoundry.evento.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.datafoundry.evento.model.EventRegistration;
import com.datafoundry.evento.repository.EventRegistrationRepository;

@Service
public class EventRegistrationServiceImpl implements EventRegistrationService {

	@Autowired
	private EventRegistrationRepository repository;

	@Override
	public List<EventRegistration> findAll() {
		return repository.findAll();
	}

	@Override
	public EventRegistration findByid(String id) {
		return repository.findByid(id);
	}

	@Override
	public EventRegistration save(EventRegistration eventregistration) {
		return repository.save(eventregistration);
	}

	@Override
	public List<EventRegistration> findByUser(String user) {
		return repository.findByUser(user);
	}

//	@Override
//	public List<EventRegistration> findByEvent(String event) {
//		return repository.findByEvent(event);
//	}

	
}
