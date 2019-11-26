package com.datafoundry.evento.service;

import java.util.List;
import com.datafoundry.evento.model.EventRegistration;

public interface EventRegistrationService {

<<<<<<< HEAD
List<EventRegistration> findAll();
=======
	EventRegistration save(EventRegistration eventregistration);
>>>>>>> refs/remotes/origin/master

	List<EventRegistration> findAll();

	EventRegistration findByid(String id);

<<<<<<< HEAD
List<EventRegistration> findByUser(String participant);

List<EventRegistration> findByEvent(String event);

=======
	List<EventRegistration> findByUser(String participant);

	List<EventRegistration> findByEvent(String event);

	
>>>>>>> refs/remotes/origin/master
}
