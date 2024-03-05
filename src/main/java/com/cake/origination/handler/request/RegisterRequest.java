package com.cake.origination.handler.request;

import com.cake.origination.logging.HideOnLogger;
import com.cake.origination.logging.MaskOnLogger;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegisterRequest {
    @MaskOnLogger
    private String userName;

    @MaskOnLogger
    private String email;

    @MaskOnLogger
    private String phoneNumber;

    @HideOnLogger
    @NotEmpty
    private String password;

}
