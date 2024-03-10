package com.cake.origination.service;

import com.cake.origination.dto.LoginDTO;
import com.cake.origination.dto.RegisterDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void register(RegisterDTO registerDTO);
    void login(LoginDTO loginDTO);
}
