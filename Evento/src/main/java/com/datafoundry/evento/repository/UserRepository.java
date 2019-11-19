package com.datafoundry.evento.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.datafoundry.evento.model.User;
@Repository
public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);

	@Query("{'address.state':?0}")
	List<User> findBystate(String state);

	@Query("{'address.city':?0}")
	List<User> findBycity(String city);

	User findByPassword(String password);

	

}
