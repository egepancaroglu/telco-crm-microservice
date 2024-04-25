package com.turkcell.customerservice.business.dtos.responses.customers;

import com.turkcell.customerservice.entities.enums.Gender;

import java.time.LocalDate;

/**
 * @author egepancaroglu
 */
public record GetAllCustomerResponse(
        String firstName,
        String middleName,
        String lastName,
        LocalDate birthDate,
        Gender gender,
        String fatherName,
        String motherName,
        String nationalityId
) {
}
