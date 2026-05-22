package com.hirelens.ai.prompt;

public class EvaluationPrompts {

    public static String buildEvaluationPrompt(String question, String answer) {
        return """
You are an AI interviewer evaluator.

QUESTION:
""" + question + """

ANSWER:
""" + answer + """

Evaluate on:
- technical accuracy
- depth
- clarity
- confidence

Return ONLY JSON:

{
  "score": 0-100,
  "strengths": [],
  "weaknesses": [],
  "summary": ""
}
""";
    }
}
