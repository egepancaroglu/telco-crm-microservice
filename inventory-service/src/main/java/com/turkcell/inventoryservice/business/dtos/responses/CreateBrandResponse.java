package com.turkcell.inventoryservice.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author egepancaroglu
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateBrandResponse {

    private int id;
    private String name;
    private LocalDateTime createdDateTime;

}
