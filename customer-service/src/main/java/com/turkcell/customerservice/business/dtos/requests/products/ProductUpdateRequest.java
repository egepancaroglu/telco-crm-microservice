package com.turkcell.customerservice.business.dtos.requests.products;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author egepancaroglu
 */
public record ProductUpdateRequest(
        @NotNull(message = "Name can't be null or blank !")
        @Size(min = 2, max = 50, message = "Name can't less than 2 or can't bigger than 50")
        String name,
        @NotNull(message = "Price can't be null or blank !")
        Double price,
        @NotNull(message = "Amount can't be null or blank !")
        @Size(min = 2, max = 50, message = "Amount can't less than 2 or can't bigger than 50")
        int amount
) {
}
