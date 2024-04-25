package com.turkcell.inventoryservice.core.cross_cutting_concerns.exceptions.types;

/**
 * @author egepancaroglu
 */

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
