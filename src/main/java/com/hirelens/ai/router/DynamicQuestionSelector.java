package com.hirelens.ai.router;

import org.springframework.stereotype.Service;

@Service
public class DynamicQuestionSelector {

    public String selectDifficulty(String jd) {

        if (jd == null) return "medium";

        String lower = jd.toLowerCase();

        if (lower.contains("senior") || lower.contains("architect")) {
            return "hard";
        }

        if (lower.contains("intern") || lower.contains("junior")) {
            return "easy";
        }

        return "medium";
    }
}
