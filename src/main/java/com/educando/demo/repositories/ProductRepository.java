package com.educando.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
