package com.example.securityDemo.services;

import com.example.securityDemo.dto.SignUpRequest;
import com.example.securityDemo.entity.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);

}
