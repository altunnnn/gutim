package com.altun.gutim.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
    @NotNull(message = "Firstname must not be null")
    @Size(max = 30, message = "Firstname must not exceed 30 characters")
    private String firstname;

    @NotNull(message = "Lastname must not be null")
    @Size(max = 30, message = "Lastname must not exceed 30 characters")
    private String lastname;

    @NotNull(message = "Email must not be null")
    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    private String email;

    @NotNull(message = "Phone must not be null")
    @Size(max = 15, message = "Phone must not exceed 15 characters")
    private String phone;
}
