package com.dudu.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dudu.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
