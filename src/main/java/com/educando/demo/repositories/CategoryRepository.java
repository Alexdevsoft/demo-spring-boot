package com.educando.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
