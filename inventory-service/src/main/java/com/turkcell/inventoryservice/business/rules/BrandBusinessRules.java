package com.turkcell.inventoryservice.business.rules;

import com.turkcell.inventoryservice.business.abstracts.MessageService;
import com.turkcell.inventoryservice.business.messages.Messages;
import com.turkcell.inventoryservice.core.cross_cutting_concerns.exceptions.types.BusinessException;
import com.turkcell.inventoryservice.data_access.BrandRepository;
import com.turkcell.inventoryservice.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author egepancaroglu
 */

@Service
@AllArgsConstructor
public class BrandBusinessRules {

    BrandRepository brandRepository;

    MessageService messageService;

    public void brandNameCanNotBeDuplicated(String brandName) {
        Optional<Brand> brand = brandRepository.findByNameIgnoreCase(brandName);
        if (brand.isPresent()) {
            throw new BusinessException(messageService.getMessage(Messages.BrandErrors.BRAND_NAME_EXISTS));
        }
    }

    public void brandShouldBeExist(int brandId) {
        Optional<Brand> foundOptionalBrand = brandRepository.findById(brandId);
        if (foundOptionalBrand.isEmpty()) {
            throw new BusinessException(messageService.getMessage(Messages.BrandErrors.BRAND_NOT_FOUND));
        }
    }

}

