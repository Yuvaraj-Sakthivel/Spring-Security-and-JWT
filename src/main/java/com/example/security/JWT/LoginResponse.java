package com.example.security.JWT;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginResponse {
    private String JwtToken;
    private String userName;
    private List<String> roles;


}
