package com.turkcell.customerservice.data_access;

import com.turkcell.customerservice.entities.concretes.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author egepancaroglu
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
