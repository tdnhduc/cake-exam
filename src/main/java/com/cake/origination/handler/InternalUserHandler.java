package com.cake.origination.handler;

import com.cake.origination.handler.response.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/internal")
public class InternalUserHandler {
    @GetMapping("user")
    public UserResponse getUser(@RequestParam("userId") String userId) {
        return UserResponse.builder()
                .reason("Get User by ID")
                .build();
    }
}
