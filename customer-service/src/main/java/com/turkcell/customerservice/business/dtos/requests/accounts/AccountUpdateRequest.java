package com.turkcell.customerservice.business.dtos.requests.accounts;

import com.turkcell.customerservice.entities.enums.Status;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author egepancaroglu
 */
public record AccountUpdateRequest(
        @NotNull(message = "Number can't be null or blank !")
        @Size(min = 10, max = 10, message = "Number can't less than 2 or can't bigger than 50")
        int number,
        @NotNull(message = "Name can't be null or blank !")
        @Size(min = 3, max = 100, message = "Name can't less than 2 or can't bigger than 50")
        String name,
        @NotNull(message = "Status can't be null or blank !")
        Status status
) {
}
