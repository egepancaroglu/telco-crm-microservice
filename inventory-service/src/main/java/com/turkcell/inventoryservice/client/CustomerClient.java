package com.turkcell.inventoryservice.client;

import com.turkcell.inventoryservice.business.dtos.client.responses.GetCustomerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author egepancaroglu
 */

@FeignClient(name = "CUSTOMER-SERVICE", url = "http://localhost:8081/api/v1/customer")
public interface CustomerClient {

    @GetMapping("/{id}")
    public GetCustomerResponse getCustomerById(@PathVariable Long id);


}
