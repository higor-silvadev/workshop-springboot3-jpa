package com.higordev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higordev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
