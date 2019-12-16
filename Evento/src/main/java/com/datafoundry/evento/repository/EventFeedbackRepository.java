package com.datafoundry.evento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.datafoundry.evento.model.EventFeedback;

@Repository
public interface EventFeedbackRepository extends MongoRepository<EventFeedback,String>{

	EventFeedback findByEventTitle(String event_title);

}
