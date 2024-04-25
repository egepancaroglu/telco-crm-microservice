package com.turkcell.inventoryservice.core.cross_cutting_concerns.exceptions.problem_details;

/**
 * @author egepancaroglu
 */
public class BusinessProblemDetails extends ProblemDetails {
    public BusinessProblemDetails() {
        setTitle("Business Rule Violation");
        setType("http://mydomain.com/exceptions/business");
        setStatus("400");
    }
}