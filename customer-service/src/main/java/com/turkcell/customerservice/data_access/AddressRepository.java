package com.turkcell.customerservice.data_access;

import com.turkcell.customerservice.entities.concretes.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author egepancaroglu
 */

public interface AddressRepository extends JpaRepository<Address, Long> {

}
