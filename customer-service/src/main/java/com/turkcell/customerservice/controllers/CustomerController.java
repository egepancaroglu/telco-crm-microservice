package com.turkcell.customerservice.controllers;

import com.turkcell.customerservice.business.dtos.responses.customers.GetCustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author egepancaroglu
 */


@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetCustomerResponse getCustomerById(@PathVariable Long id) {

        return null;
    }

}
