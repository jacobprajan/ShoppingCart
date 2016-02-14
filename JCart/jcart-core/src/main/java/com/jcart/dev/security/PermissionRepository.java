package com.jcart.dev.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcart.dev.entities.Permission;

public interface PermissionRepository extends
		JpaRepository<Permission, Integer>
{

}