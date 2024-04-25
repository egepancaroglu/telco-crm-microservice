package com.turkcell.customerservice.business.abstracts;

import com.turkcell.customerservice.business.dtos.requests.addresses.AddressCreateRequest;
import com.turkcell.customerservice.business.dtos.requests.addresses.AddressUpdateRequest;
import com.turkcell.customerservice.business.dtos.responses.addresses.CreateAddressResponse;
import com.turkcell.customerservice.business.dtos.responses.addresses.GetAddressResponse;
import com.turkcell.customerservice.business.dtos.responses.addresses.GetAllAddressResponse;
import com.turkcell.customerservice.business.dtos.responses.addresses.UpdateAddressResponse;

import java.util.List;

/**
 * @author egepancaroglu
 */
public interface AddressService {

    GetAddressResponse getById(Long id);

    List<GetAllAddressResponse> getAll();

    CreateAddressResponse createAddress(AddressCreateRequest addressCreateRequest);

    UpdateAddressResponse update(AddressUpdateRequest addressUpdateRequest);

    void delete(Long id);


}
