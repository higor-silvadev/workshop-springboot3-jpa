package com.higordev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higordev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
