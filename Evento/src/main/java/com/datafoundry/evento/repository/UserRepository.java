package com.datafoundry.evento.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.datafoundry.evento.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
	

}
