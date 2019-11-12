package com.datafoundry.evento.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.datafoundry.evento.model.User;
@Repository
public interface UserRepository extends MongoRepository<User, String> {
//login module//
	User findByEmail(String email);

	User findByPassword(String password);
	

}
