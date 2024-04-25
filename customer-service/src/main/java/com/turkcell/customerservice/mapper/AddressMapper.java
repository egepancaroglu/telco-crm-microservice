package com.turkcell.customerservice.mapper;

import com.turkcell.customerservice.business.dtos.requests.addresses.AddressCreateRequest;
import com.turkcell.customerservice.business.dtos.requests.addresses.AddressUpdateRequest;
import com.turkcell.customerservice.business.dtos.responses.addresses.CreateAddressResponse;
import com.turkcell.customerservice.business.dtos.responses.addresses.GetAddressResponse;
import com.turkcell.customerservice.business.dtos.responses.addresses.GetAllAddressResponse;
import com.turkcell.customerservice.business.dtos.responses.addresses.UpdateAddressResponse;
import com.turkcell.customerservice.entities.concretes.Address;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

/**
 * @author egepancaroglu
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AddressMapper {

    Address convertToAddress(AddressCreateRequest request);

    CreateAddressResponse convertToCreateAddressResponse(Address address);

    GetAddressResponse convertToGetAddressResponse(Address address);

    GetAllAddressResponse convertToGetAllAddressResponse(Address address);

    UpdateAddressResponse convertToUpdateAddressResponse(Address address);

    void updateAddressRequest(@MappingTarget Address address, AddressUpdateRequest request);

}
