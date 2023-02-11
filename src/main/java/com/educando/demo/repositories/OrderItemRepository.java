package com.educando.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
