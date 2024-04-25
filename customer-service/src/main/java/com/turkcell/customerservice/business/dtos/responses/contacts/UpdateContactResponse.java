package com.turkcell.customerservice.business.dtos.responses.contacts;

/**
 * @author egepancaroglu
 */
public record UpdateContactResponse(
        String email,
        String homePhone,
        String mobilePhone,
        String fax
) {
}
