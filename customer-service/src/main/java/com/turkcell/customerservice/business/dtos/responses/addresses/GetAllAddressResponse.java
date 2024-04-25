package com.turkcell.customerservice.business.dtos.responses.addresses;

/**
 * @author egepancaroglu
 */
public record GetAllAddressResponse(
        String city,
        String street,
        String houseNumber,
        String description) {
}

