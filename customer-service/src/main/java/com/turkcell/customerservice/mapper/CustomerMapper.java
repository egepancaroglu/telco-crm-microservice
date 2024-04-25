package com.turkcell.customerservice.mapper;

import com.turkcell.customerservice.business.dtos.requests.addresses.AddressUpdateRequest;
import com.turkcell.customerservice.business.dtos.requests.customers.CustomerCreateRequest;
import com.turkcell.customerservice.business.dtos.responses.customers.CreateCustomerResponse;
import com.turkcell.customerservice.business.dtos.responses.customers.GetAllCustomerResponse;
import com.turkcell.customerservice.business.dtos.responses.customers.GetCustomerResponse;
import com.turkcell.customerservice.business.dtos.responses.customers.UpdateCustomerResponse;
import com.turkcell.customerservice.entities.concretes.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

/**
 * @author egepancaroglu
 */

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CustomerMapper {

    Customer convertToCustomer(CustomerCreateRequest request);

    CreateCustomerResponse convertToCreateCustomerResponse(Customer contact);

    GetCustomerResponse convertToGetCustomerResponse(Customer contact);

    GetAllCustomerResponse convertToGetAllCustomerResponse(Customer contact);

    UpdateCustomerResponse convertToUpdateCustomerResponse(Customer contact);

    void updateCustomerRequest(@MappingTarget Customer contact, AddressUpdateRequest request);

}
