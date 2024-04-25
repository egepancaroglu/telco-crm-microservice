package com.turkcell.inventoryservice.core.cross_cutting_concerns.exceptions.problem_details;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author egepancaroglu
 */
@Getter
@Setter
public class ValidationProblemDetails extends ProblemDetails {
    private Map<String, String> errors;

    public ValidationProblemDetails() {
        setTitle("Validation Rule Violation");
        setDetail("Validation Problem");
        setType("http://mydomain.com/exceptions/validation");
        setStatus("400");
    }
}
