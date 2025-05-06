package com.higordev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higordev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
