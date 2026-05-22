package com.hirelens.ai.prompt;

public class GeminiPrompts {

    public static String buildQuestionPrompt(String jd, String resume) {
        return """
You are an expert technical interviewer.

JOB DESCRIPTION:
""" + jd + """

CANDIDATE RESUME:
""" + resume + """

TASK:
Generate exactly 3 technical interview questions.

RULES:
- Questions must be role-specific
- No generic questions
- Medium difficulty
- Output ONLY valid JSON array

FORMAT:
[
  {"question": "..."},
  {"question": "..."},
  {"question": "..."}
]
""";
    }
}
