package com.jcart.dev.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcart.dev.entities.User;


public interface UserRepository extends JpaRepository<User, Integer>
{
	// the below api will be converted to query using the JPA criteria API
	// Spring Data JPA will do a property check and traverse nested properties
	// select u from User u where u.email = ?1
	
	User findByEmail(String email);

}
