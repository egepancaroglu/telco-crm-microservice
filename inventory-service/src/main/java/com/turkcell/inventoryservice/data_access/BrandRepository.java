package com.turkcell.inventoryservice.data_access;

import com.turkcell.inventoryservice.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author egepancaroglu
 */

public interface BrandRepository extends JpaRepository<Brand, Integer> {
    Optional<Brand> findByNameIgnoreCase(String name);
}
