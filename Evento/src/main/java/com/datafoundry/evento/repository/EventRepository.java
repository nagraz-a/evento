package com.datafoundry.evento.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.datafoundry.evento.model.Event;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {

	@Query("{'owner.id':?0}")
	List<Event> findByUserid(String id);


	Event findByid(String id);


	@Query("{'venue.city':?0}")
	List<Event> findByCity(String city);


	Event findBytitle(String title);


}