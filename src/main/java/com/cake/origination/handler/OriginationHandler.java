package com.cake.origination.handler;

import com.cake.origination.handler.request.RegisterRequest;
import com.cake.origination.handler.response.RegisterResponse;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/origination", produces = {MediaType.APPLICATION_JSON_VALUE})
public class OriginationHandler {
    @PostMapping(value = "register")
    public RegisterResponse register(@Valid @RequestBody RegisterRequest request) {
        return RegisterResponse.builder()
                .reason("Hello world")
                .build();
    }
}
