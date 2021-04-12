package com.casa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
