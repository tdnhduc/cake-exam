package com.cake.origination.utils;

import org.springframework.stereotype.Component;

@Component
public class HashUtil {
    public String encryptPassword(String plainTextPassword) {
        return plainTextPassword; // TODO hash + salt pass
    }
}
