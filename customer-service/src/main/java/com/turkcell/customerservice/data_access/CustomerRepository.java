package com.turkcell.customerservice.data_access;

import com.turkcell.customerservice.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author egepancaroglu
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
