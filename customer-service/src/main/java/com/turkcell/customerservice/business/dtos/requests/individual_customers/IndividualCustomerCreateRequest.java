package com.turkcell.customerservice.business.dtos.requests.individual_customers;

import com.turkcell.customerservice.entities.enums.Gender;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

/**
 * @author egepancaroglu
 */
public record IndividualCustomerCreateRequest(
        @NotNull(message = "Nationality Id can't be null or blank !")
        @Size(min = 10, max = 10, message = "Nationality Id can't less than 2 or can't bigger than 50")
        String nationalityId,
        @NotNull(message = "First Name can't be null or blank !")
        @Size(min = 3, max = 100, message = "First Name can't less than 2 or can't bigger than 50")
        String firstName,
        @NotNull(message = "Middle Name can't be null or blank !")
        @Size(min = 3, max = 100, message = "Middle Name can't less than 2 or can't bigger than 50")
        String middleName,
        @NotNull(message = "Last Name can't be null or blank !")
        @Size(min = 3, max = 100, message = "Last Name can't less than 2 or can't bigger than 50")
        String lastName,
        @NotNull(message = "Father Name can't be null or blank !")
        @Size(min = 3, max = 100, message = "Father Name can't less than 2 or can't bigger than 50")
        String fatherName,
        @NotNull(message = "Mother Name can't be null or blank !")
        @Size(min = 3, max = 100, message = "Mother Name can't less than 2 or can't bigger than 50")
        String motherName,
        @NotNull(message = "Birth Date can't be null or blank !")
        @Past
        @Future
        LocalDate birthDate,
        @NotNull(message = "Home Phone can't be null or blank !")
        @Size(min = 3, max = 100, message = "Home Phone can't less than 2 or can't bigger than 50")
        String homePhone,
        @NotNull(message = "Mobile Phone can't be null or blank !")
        @Size(min = 3, max = 100, message = "Middle Name can't less than 2 or can't bigger than 50")
        String mobilePhone,
        @NotNull(message = "Fax Number can't be null or blank !")
        @Size(min = 3, max = 100, message = "Fax Number can't less than 2 or can't bigger than 50")
        String faxNumber,
        @NotNull(message = "Gender can't be null or blank !")
        Gender gender
) {
}
