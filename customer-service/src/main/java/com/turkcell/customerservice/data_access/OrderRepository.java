package com.turkcell.customerservice.data_access;

import com.turkcell.customerservice.entities.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author egepancaroglu
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
