package com.turkcell.customerservice.mapper;

import com.turkcell.customerservice.business.dtos.requests.addresses.AddressUpdateRequest;
import com.turkcell.customerservice.business.dtos.requests.contacts.ContactCreateRequest;
import com.turkcell.customerservice.business.dtos.responses.contacts.CreateContactResponse;
import com.turkcell.customerservice.business.dtos.responses.contacts.GetAllContactResponse;
import com.turkcell.customerservice.business.dtos.responses.contacts.GetContactResponse;
import com.turkcell.customerservice.business.dtos.responses.contacts.UpdateContactResponse;
import com.turkcell.customerservice.entities.concretes.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

/**
 * @author egepancaroglu
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ContactMapper {

    Contact convertToContact(ContactCreateRequest request);

    CreateContactResponse convertToCreateContactResponse(Contact contact);

    GetContactResponse convertToGetContactResponse(Contact contact);

    GetAllContactResponse convertToGetAllContactResponse(Contact contact);

    UpdateContactResponse convertToUpdateContactResponse(Contact contact);

    void updateContactRequest(@MappingTarget Contact contact, AddressUpdateRequest request);


}
