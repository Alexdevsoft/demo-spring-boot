package com.educando.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
