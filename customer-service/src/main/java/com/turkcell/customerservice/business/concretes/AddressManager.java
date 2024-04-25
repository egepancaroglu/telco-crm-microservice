package com.turkcell.customerservice.business.concretes;

import com.turkcell.customerservice.business.abstracts.AddressService;
import com.turkcell.customerservice.business.dtos.requests.addresses.AddressCreateRequest;
import com.turkcell.customerservice.business.dtos.requests.addresses.AddressUpdateRequest;
import com.turkcell.customerservice.business.dtos.responses.addresses.CreateAddressResponse;
import com.turkcell.customerservice.business.dtos.responses.addresses.GetAddressResponse;
import com.turkcell.customerservice.business.dtos.responses.addresses.GetAllAddressResponse;
import com.turkcell.customerservice.business.dtos.responses.addresses.UpdateAddressResponse;
import com.turkcell.customerservice.data_access.AddressRepository;
import com.turkcell.customerservice.entities.concretes.Address;
import com.turkcell.customerservice.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author egepancaroglu
 */
@Service
@RequiredArgsConstructor
public class AddressManager implements AddressService {

    private AddressRepository addressRepository;
    private AddressMapper addressMapper;

    @Override
    public GetAddressResponse getById(Long id) {
        return null;
    }

    @Override
    public List<GetAllAddressResponse> getAll() {
        return null;
    }

    @Override
    public CreateAddressResponse createAddress(AddressCreateRequest addressCreateRequest) {
        Address address = addressMapper.convertToAddress(addressCreateRequest);
        address.setCreatedDate(LocalDateTime.now());
        address = addressRepository.save(address);
        return addressMapper.convertToCreateAddressResponse(address);
    }

    @Override
    public UpdateAddressResponse update(AddressUpdateRequest addressUpdateRequest) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
