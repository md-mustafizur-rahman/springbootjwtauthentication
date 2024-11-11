package org.example.SpringBootJWTAuthentication.DTO;

import lombok.Data;

@Data
public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

    // getters and setters here...
}