package com.cake.origination.service.impl;

import com.cake.origination.dto.LoginDTO;
import com.cake.origination.dto.RegisterDTO;
import com.cake.origination.exception.DomainCode;
import com.cake.origination.exception.DomainException;
import com.cake.origination.repository.UserRepository;
import com.cake.origination.repository.entity.UserEntity;
import com.cake.origination.service.UserService;
import com.cake.origination.utils.HashUtil;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CacheManager cacheManager;
    @Autowired
    private HashUtil hashUtil;

    @Override
    public void register(RegisterDTO registerDTO) {
        this.throwIfUserDoesNotExist(registerDTO.getUserName(), registerDTO.getPhoneNumber(), registerDTO.getEmail());
        // persist to db
        // publish event
    }

    @Override
    public void login(LoginDTO loginDTO) {
        var userEntity = this.findUser(loginDTO.getUserName(), loginDTO.getPhoneNumber(),
                loginDTO.getEmail()).orElseThrow(() -> new DomainException(DomainCode.INVALID_REQUEST));
        // TODO: hash + salt pass & compare with database password;
        // if valid:
        //  1.renew TTL session user & return session token
        //  2.publish login event
        // else: throw invalid request + increase incorrect password counter

    }

    private void throwIfUserDoesNotExist(String userName, String phoneNumber, String email) {
        if (!this.userRepository.existsUserEntitiesByUserNameOrPhoneNumberOrEmail(userName, phoneNumber, email)) {
            throw new DomainException(DomainCode.USER_EXISTED);
        }
    }

    private Optional<UserEntity> findUser(String userName, String phoneNumber, String email) {
        if (!StringUtils.isNullOrEmpty(userName)) {
            return this.userRepository.findUserEntitiesByUserName(userName);
        } else if (!StringUtils.isNullOrEmpty(phoneNumber)) {
            return this.userRepository.findUserEntitiesByPhoneNumber(phoneNumber);
        } else if (!StringUtils.isNullOrEmpty(email)) {
            return this.userRepository.findUserEntitiesByEmail(email);
        }
        return Optional.empty();
    }

}
