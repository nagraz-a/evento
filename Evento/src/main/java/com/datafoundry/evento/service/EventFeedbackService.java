package com.datafoundry.evento.service;

import java.util.List;

import com.datafoundry.evento.model.Event;
import com.datafoundry.evento.model.EventFeedback;

public interface EventFeedbackService {

	EventFeedback save(EventFeedback feedback);

	List<EventFeedback> findAll();

	EventFeedback findByEventTitle(String event_title);

}
