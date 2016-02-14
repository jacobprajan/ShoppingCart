package com.jcart.dev.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcart.dev.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>
{

	Role findByName(String name);

}
