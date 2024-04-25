package com.turkcell.inventoryservice.business.concretes;

import com.turkcell.inventoryservice.business.abstracts.BrandService;
import com.turkcell.inventoryservice.business.dtos.requests.CreateBrandRequest;
import com.turkcell.inventoryservice.business.dtos.responses.CreateBrandResponse;
import com.turkcell.inventoryservice.business.dtos.responses.GetAllBrandResponse;
import com.turkcell.inventoryservice.business.rules.BrandBusinessRules;
import com.turkcell.inventoryservice.core.utilities.mapping.ModelMapperService;
import com.turkcell.inventoryservice.data_access.BrandRepository;
import com.turkcell.inventoryservice.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author egepancaroglu
 */

@AllArgsConstructor
@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    private ModelMapperService modelMapperService;

    private BrandBusinessRules brandBussinessRules;


    @Override
    public CreateBrandResponse add(CreateBrandRequest createBrandRequest) {
        brandBussinessRules.brandNameCanNotBeDuplicated(createBrandRequest.getName());

        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
        brand.setCreatedDate(LocalDateTime.now());
        Brand createdBrand = brandRepository.save(brand);

        CreateBrandResponse createdBrandResponse =
                this.modelMapperService.forResponse().map(createdBrand, CreateBrandResponse.class);
        return createdBrandResponse;
    }

    @Override
    public List<GetAllBrandResponse> getAll() {
        List<GetAllBrandResponse> brandResponses = new ArrayList<>();
        List<Brand> brands = brandRepository.findAll();
        for (Brand brand : brands) {
            GetAllBrandResponse brandResponse =
                    this.modelMapperService.forResponse().map(brand, GetAllBrandResponse.class);
            brandResponses.add(brandResponse);
        }
        return brandResponses;
    }
}
