package com.turkcell.customerservice.business.dtos.requests.orders;

import jakarta.validation.constraints.NotNull;

/**
 * @author egepancaroglu
 */

public record OrderUpdateRequest(
        @NotNull(message = "Total Price can't be null or blank !")
        Double totalPrice
) {
}
