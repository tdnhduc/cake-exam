package com.cake.origination.repository;

import com.cake.origination.repository.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {
    Optional<UserEntity> findUserEntitiesByUserName(String userName);
    Optional<UserEntity> findUserEntitiesByPhoneNumber(String phoneNumber);
    Optional<UserEntity> findUserEntitiesByEmail(String email);
    Boolean existsUserEntitiesByUserNameOrPhoneNumberOrEmail(String userName, String phoneNumber, String email);
}
