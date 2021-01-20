package com.projetospring.ps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.ps.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
