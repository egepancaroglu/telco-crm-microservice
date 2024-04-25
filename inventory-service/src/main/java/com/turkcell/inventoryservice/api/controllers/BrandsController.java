package com.turkcell.inventoryservice.api.controllers;

import com.turkcell.inventoryservice.business.abstracts.BrandService;
import com.turkcell.inventoryservice.business.dtos.requests.CreateBrandRequest;
import com.turkcell.inventoryservice.business.dtos.responses.CreateBrandResponse;
import com.turkcell.inventoryservice.business.dtos.responses.GetAllBrandResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author egepancaroglu
 */

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/brands")
public class BrandsController {

    private BrandService brandService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateBrandResponse add(@Valid @RequestBody CreateBrandRequest createBrandRequest) {
        return brandService.add(createBrandRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllBrandResponse> getAll() {
        return brandService.getAll();
    }

}
