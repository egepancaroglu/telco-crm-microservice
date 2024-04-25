package com.turkcell.customerservice.business.concretes;

import com.turkcell.customerservice.business.abstracts.CustomerService;
import com.turkcell.customerservice.business.dtos.requests.customers.CustomerCreateRequest;
import com.turkcell.customerservice.business.dtos.requests.customers.CustomerUpdateRequest;
import com.turkcell.customerservice.business.dtos.responses.customers.CreateCustomerResponse;
import com.turkcell.customerservice.business.dtos.responses.customers.GetAllCustomerResponse;
import com.turkcell.customerservice.business.dtos.responses.customers.GetCustomerResponse;
import com.turkcell.customerservice.business.dtos.responses.customers.UpdateCustomerResponse;
import com.turkcell.customerservice.data_access.CustomerRepository;
import com.turkcell.customerservice.entities.concretes.Customer;
import com.turkcell.customerservice.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author egepancaroglu
 */
@Service
@RequiredArgsConstructor
public class CustomerManager implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @Override
    public List<GetAllCustomerResponse> getAllCustomers() {
        return null;
    }

    @Override
    public GetCustomerResponse getCustomerById(Long id) {
        return null;
    }

    @Override
    public CreateCustomerResponse saveCustomer(CustomerCreateRequest customerCreateRequest) {

        Customer customer = customerMapper.convertToCustomer(customerCreateRequest);

        customer = customerRepository.save(customer);

        return customerMapper.convertToCreateCustomerResponse(customer);

    }

    @Override
    public UpdateCustomerResponse updateCustomer(CustomerUpdateRequest customerUpdateRequest) {
        return null;
    }

    @Override
    public void deleteCustomerById(Long id) {

    }
}
