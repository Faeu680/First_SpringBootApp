package com.projetospring.ps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.ps.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
