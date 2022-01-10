package com.example.demo.repositories;

import com.example.demo.entities.OrderItem;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
