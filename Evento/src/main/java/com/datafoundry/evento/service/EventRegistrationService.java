package com.datafoundry.evento.service;

import java.util.List;
import com.datafoundry.evento.model.EventRegistration;

public interface EventRegistrationService {

	EventRegistration save(EventRegistration eventregistration);

	List<EventRegistration> findAll();

	EventRegistration findByid(String id);

	List<EventRegistration> findByUser(String participant);

	List<EventRegistration> findByEvent(String event);

	
}
