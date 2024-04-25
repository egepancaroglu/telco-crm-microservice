package com.turkcell.customerservice.business.dtos.requests.addresses;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author egepancaroglu
 */

public record AddressUpdateRequest(
        @NotNull(message = "City can't be null or blank !")
        @Size(min = 2, max = 50, message = "City can't less than 2 or can't bigger than 50")
        String city,
        @NotNull(message = "Street can't be null or blank !")
        @Size(min = 2, max = 50, message = "Street can't less than 2 or can't bigger than 50")
        String street,
        @NotNull(message = "House Number can't be null or blank !")
        @Size(min = 1, max = 250, message = "House Number can't less than 1 or can't bigger than 250")
        String houseNumber,
        @NotNull(message = "Description can't be null or blank !")
        @Size(min = 3, max = 255, message = "House Number can't less than 3 or can't bigger than 255")
        String description) {
}
