package com.higordev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higordev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
