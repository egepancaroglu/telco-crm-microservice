package com.turkcell.inventoryservice.core.cross_cutting_concerns.exceptions.problem_details;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author egepancaroglu
 */
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ProblemDetails {

    private String title;
    private String detail;
    private String Status;
    private String Type;

}
