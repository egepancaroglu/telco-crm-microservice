package com.turkcell.customerservice.business.dtos.requests.order_items;

import jakarta.validation.constraints.NotNull;

/**
 * @author egepancaroglu
 */
public record OrderItemUpdateRequest(
        @NotNull(message = "Price can't be null or blank !")
        Double price
) {
}
