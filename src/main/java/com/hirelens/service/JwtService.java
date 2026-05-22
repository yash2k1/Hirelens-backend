package com.hirelens.service;

import com.hirelens.security.JwtTokenProvider;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private final JwtTokenProvider provider;

    public JwtService(JwtTokenProvider provider) {
        this.provider = provider;
    }

    public String generate(String username) {
        return provider.generateToken(username);
    }
}
