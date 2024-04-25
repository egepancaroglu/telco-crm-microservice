package com.turkcell.customerservice.data_access;

import com.turkcell.customerservice.entities.concretes.CorporateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author egepancaroglu
 */
public interface CorporateCustomerRepository extends JpaRepository<CorporateCustomer, Long> {
}
