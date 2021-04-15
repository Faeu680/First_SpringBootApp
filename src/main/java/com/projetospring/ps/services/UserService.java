package com.projetospring.ps.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospring.ps.entities.User;
import com.projetospring.ps.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById (Long id) {
		Optional<User> op = repository.findById(id);
		return op.get();
	}
	
	public User insert (User obj){
		return repository.save(obj);
	}
	
	public void delete (Long id) {
		repository.deleteById(id);
	}
}
