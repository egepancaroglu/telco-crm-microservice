package com.turkcell.customerservice.business.dtos.responses.addresses;

/**
 * @author egepancaroglu
 */
public record UpdateAddressResponse(
        String city,
        String street,
        String houseNumber,
        String description) {
}

