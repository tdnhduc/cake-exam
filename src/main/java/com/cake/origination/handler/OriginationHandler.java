package com.cake.origination.handler;

import com.cake.origination.handler.request.LoginRequest;
import com.cake.origination.handler.request.RegisterRequest;
import com.cake.origination.handler.response.LoginResponse;
import com.cake.origination.handler.response.RegisterResponse;
import com.cake.origination.service.UserService;
import jakarta.validation.Valid;
import mapper.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/origination", produces = {MediaType.APPLICATION_JSON_VALUE})
public class OriginationHandler {

    @Autowired
    private UserService userService;

    @PostMapping(value = "register")
    public RegisterResponse register(@Valid @RequestBody RegisterRequest request) {
        this.userService.register(DTOMapper.INSTANCE.toRegisterDTO(request)); // TODO: handle here
        return RegisterResponse.builder()
                .reason("Hello world")
                .build();
    }

    @PostMapping(value = "login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {
        this.userService.login(DTOMapper.INSTANCE.toLoginDTO(request));
        return LoginResponse.builder()
                .reason("Hello login")
                .build();
    }
}
