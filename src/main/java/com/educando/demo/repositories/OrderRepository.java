package com.educando.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
