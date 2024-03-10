package com.cake.origination.handler.request;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginRequest {
    @Nullable
    private String userName;
    @Nullable
    private String email;
    @Nullable
    private String phoneNumber;
    @NotBlank
    private String password;
}
