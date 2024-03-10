package com.cake.origination.dto;

import com.cake.origination.logging.MaskOnLogger;
import lombok.*;

@Data
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {
    @MaskOnLogger
    private String userName;
    @MaskOnLogger
    private String email;
    @MaskOnLogger
    private String phoneNumber;
    @MaskOnLogger
    private String firstName;
    @MaskOnLogger
    private String lastName;
}
