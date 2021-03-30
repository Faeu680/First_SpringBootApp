package com.projetospring.ps.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospring.ps.entities.Product;
import com.projetospring.ps.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById (Long id) {
		Optional<Product> op = repository.findById(id);
		return op.get();
	}
}
