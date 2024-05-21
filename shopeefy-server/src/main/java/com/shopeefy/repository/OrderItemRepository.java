package com.shopeefy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopeefy.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
