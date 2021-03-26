package com.projetospring.ps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.ps.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
