package com.turkcell.inventoryservice.core.business.abstracts;

/**
 * @author egepancaroglu
 */

public interface MessageService {

    String getMessage(String key);

    String getMessageWithArgs(String key, Object... args);
}

