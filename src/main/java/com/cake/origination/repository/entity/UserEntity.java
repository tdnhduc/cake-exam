package com.cake.origination.repository.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "user_info")
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotNull
    private String userName;

    @NotNull
    private String phoneNumber;

    @NotNull
    private String email;

    @NotNull
    private String firstName;

    @Nullable
    private String lastName;

    @NotNull
    private String password;

    @NotNull
    private String salt;
}
