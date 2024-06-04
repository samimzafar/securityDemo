package com.example.securityDemo.services;

import com.example.securityDemo.dto.JwtAuthenticationResponse;
import com.example.securityDemo.dto.RefreshTokenRequest;
import com.example.securityDemo.dto.SignInRequest;
import com.example.securityDemo.dto.SignUpRequest;
import com.example.securityDemo.entity.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);


}
