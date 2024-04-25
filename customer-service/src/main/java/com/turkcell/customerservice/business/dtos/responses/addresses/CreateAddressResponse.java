package com.turkcell.customerservice.business.dtos.responses.addresses;

/**
 * @author egepancaroglu
 */
public record CreateAddressResponse(
        String city,
        String street,
        String houseNumber,
        String description) {
}
