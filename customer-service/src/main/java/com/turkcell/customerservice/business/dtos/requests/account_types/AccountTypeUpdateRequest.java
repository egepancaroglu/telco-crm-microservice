package com.turkcell.customerservice.business.dtos.requests.account_types;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author egepancaroglu
 */
public record AccountTypeUpdateRequest(
        @NotNull(message = "Name can't be null or blank !")
        @Size(min = 3, max = 100, message = "Name can't less than 2 or can't bigger than 50")
        String name
) {
}
