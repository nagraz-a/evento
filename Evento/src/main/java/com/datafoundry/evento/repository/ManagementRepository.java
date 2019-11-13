package com.datafoundry.evento.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.datafoundry.evento.model.Management;

public interface ManagementRepository extends MongoRepository<Management, String>{

	Management findByeventTitle(String eventTitle);

	Management findByid(String id);

}
