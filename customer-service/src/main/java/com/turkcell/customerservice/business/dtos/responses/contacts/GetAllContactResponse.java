package com.turkcell.customerservice.business.dtos.responses.contacts;

/**
 * @author egepancaroglu
 */
public record GetAllContactResponse(
        String email,
        String homePhone,
        String mobilePhone,
        String fax
) {
}
