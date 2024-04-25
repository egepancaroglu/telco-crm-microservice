package com.turkcell.inventoryservice.business.abstracts;

import com.turkcell.inventoryservice.business.dtos.requests.CreateBrandRequest;
import com.turkcell.inventoryservice.business.dtos.responses.CreateBrandResponse;
import com.turkcell.inventoryservice.business.dtos.responses.GetAllBrandResponse;

import java.util.List;

/**
 * @author egepancaroglu
 */

public interface BrandService {

    CreateBrandResponse add(CreateBrandRequest createBrandRequest);

    List<GetAllBrandResponse> getAll();

}

