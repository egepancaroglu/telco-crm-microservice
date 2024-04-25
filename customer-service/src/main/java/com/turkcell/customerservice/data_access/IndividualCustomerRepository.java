package com.turkcell.customerservice.data_access;

import com.turkcell.customerservice.entities.concretes.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author egepancaroglu
 */
public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer, Long> {
}
