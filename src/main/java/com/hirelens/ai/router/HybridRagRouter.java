package com.hirelens.ai.router;

import org.springframework.stereotype.Service;

@Service
public class HybridRagRouter {

    public String route(String jd, String resume) {

        if (jd == null || resume == null) {
            return "fallback";
        }

        if (resume.length() > 5000) {
            return "compressed_mode";
        }

        return "standard_mode";
    }
}
