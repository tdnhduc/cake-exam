package com.cake.origination.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    @Nullable
    private String userName;
    @Nullable
    private String email;
    @Nullable
    private String phoneNumber;
    @NotBlank
    private String password;
}
