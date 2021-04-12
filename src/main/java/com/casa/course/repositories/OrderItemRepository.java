package com.casa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
