package com.projetospring.ps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.ps.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
