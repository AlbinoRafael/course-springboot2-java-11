package com.casa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
