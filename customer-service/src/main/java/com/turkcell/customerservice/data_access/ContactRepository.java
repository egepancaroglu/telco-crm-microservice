package com.turkcell.customerservice.data_access;

import com.turkcell.customerservice.entities.concretes.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author egepancaroglu
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
