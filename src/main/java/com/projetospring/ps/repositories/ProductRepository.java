package com.projetospring.ps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.ps.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
