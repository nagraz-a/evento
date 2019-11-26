package com.datafoundry.evento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datafoundry.evento.model.User;
import com.datafoundry.evento.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	 private UserRepository repository;	

	@Override
	public User findByEmail(String email) {
		
		return repository.findByEmail(email);
	}

//	@Override
//	public User save(User user) {
//		return repository.save(user);
//		
	@Override
	public User save(String first_name) {
		return repository.save(first_name);
	}

	@Override
	public List<User> findBystate(String state) {
			return repository.findBystate(state);
	}

	@Override
	public List<User> findBycity(String city) {
				return repository.findBycity(city);
	}

	@Override
	public User findByPassword(String password) {
		return repository.findByPassword(password);
	}

	@Override
	public List<User> findAll() {
		
		return repository.findAll();
	}

	

	
}
