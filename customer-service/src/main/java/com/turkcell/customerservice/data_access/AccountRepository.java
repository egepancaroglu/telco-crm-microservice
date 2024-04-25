package com.turkcell.customerservice.data_access;

import com.turkcell.customerservice.entities.concretes.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author egepancaroglu
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

}
