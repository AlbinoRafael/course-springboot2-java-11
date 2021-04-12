package com.casa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
