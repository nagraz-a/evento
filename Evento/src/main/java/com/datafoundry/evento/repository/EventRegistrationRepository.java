package com.datafoundry.evento.repository;


import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.datafoundry.evento.model.EventRegistration;

@Repository
public interface EventRegistrationRepository extends MongoRepository<EventRegistration,String>{
//repository..//
	EventRegistration findByid(String id);
	
	@Query("{'User.id':?0}")
	List<EventRegistration> findByUser(String user_id);

}
