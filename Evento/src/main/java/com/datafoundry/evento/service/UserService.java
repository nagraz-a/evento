package com.datafoundry.evento.service;

import java.util.List;



import com.datafoundry.evento.model.User;

public interface UserService {
	
	User save(String first_name);


	User findByEmail(String email);
	

	
	List<User> findBystate(String state);

	List<User> findBycity(String city);

	
	User findByPassword(String password);


	List<User> findAll();

	



}
