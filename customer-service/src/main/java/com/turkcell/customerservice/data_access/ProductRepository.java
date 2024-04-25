package com.turkcell.customerservice.data_access;

import com.turkcell.customerservice.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author egepancaroglu
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
