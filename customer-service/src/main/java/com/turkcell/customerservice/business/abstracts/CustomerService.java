package com.turkcell.customerservice.business.abstracts;

import com.turkcell.customerservice.business.dtos.requests.customers.CustomerCreateRequest;
import com.turkcell.customerservice.business.dtos.requests.customers.CustomerUpdateRequest;
import com.turkcell.customerservice.business.dtos.responses.customers.CreateCustomerResponse;
import com.turkcell.customerservice.business.dtos.responses.customers.GetAllCustomerResponse;
import com.turkcell.customerservice.business.dtos.responses.customers.GetCustomerResponse;
import com.turkcell.customerservice.business.dtos.responses.customers.UpdateCustomerResponse;

import java.util.List;

/**
 * @author egepancaroglu
 */
public interface CustomerService {

    List<GetAllCustomerResponse> getAllCustomers();

    GetCustomerResponse getCustomerById(Long id);

    CreateCustomerResponse saveCustomer(CustomerCreateRequest customerCreateRequest);

    UpdateCustomerResponse updateCustomer(CustomerUpdateRequest customerUpdateRequest);

    void deleteCustomerById(Long id);
    

}
