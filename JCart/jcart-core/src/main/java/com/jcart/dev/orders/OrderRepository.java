package com.jcart.dev.orders;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcart.dev.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Integer>
{
	Order findByOrderNumber(String orderNumber);
}
