package com.example.security.JWT;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginRequest {
    private String username;
    private String password;
}
