package com.turkcell.customerservice.business.dtos.responses.contacts;

/**
 * @author egepancaroglu
 */
public record CreateContactResponse(
        String email,
        String homePhone,
        String mobilePhone,
        String fax) {
}
