package com.hirelens.security;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    public String generateToken(String username) {
        // TODO: Replace with real JWT later (jjwt or auth0)
        return "token-" + username;
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("token-");
    }

    public String getUsername(String token) {
        return token.replace("token-", "");
    }
}