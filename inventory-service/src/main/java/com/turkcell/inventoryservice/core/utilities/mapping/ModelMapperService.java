package com.turkcell.inventoryservice.core.utilities.mapping;

import org.modelmapper.ModelMapper;

/**
 * @author egepancaroglu
 */
public interface ModelMapperService {

    ModelMapper forResponse();

    ModelMapper forRequest();
}
