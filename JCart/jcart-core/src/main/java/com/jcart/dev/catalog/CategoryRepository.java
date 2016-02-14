package com.jcart.dev.catalog;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcart.dev.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{

	Category getByName(String name);

}
