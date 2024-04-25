package com.turkcell.customerservice.business.dtos.requests.corporate_customers;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author egepancaroglu
 */
public record CorporateCustomerCreateRequest(
        @NotNull(message = "Company Name can't be null or blank !")
        @Size(min = 10, max = 10, message = "Company Name can't less than 2 or can't bigger than 50")
        int companyName,
        @NotNull(message = "Tax Number can't be null or blank !")
        @Size(min = 3, max = 100, message = "Tax Number can't less than 2 or can't bigger than 50")
        String taxNumber,
        @NotNull(message = "Fax Number can't be null or blank !")
        @Size(min = 3, max = 100, message = "Fax Number can't less than 2 or can't bigger than 50")
        String faxNumber
) {
}
