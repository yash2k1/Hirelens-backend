package com.hirelens.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.hirelens.ai.parser.GeminiJsonParser;
import com.hirelens.ai.prompt.GeminiPrompts;
import com.hirelens.service.GeminiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final GeminiService geminiService;
    private final GeminiJsonParser jsonParser;

    public QuestionController(GeminiService geminiService,
                              GeminiJsonParser jsonParser) {
        this.geminiService = geminiService;
        this.jsonParser = jsonParser;
    }

    /**
     * Generate AI-based interview questions using JD + Resume
     */
    @PostMapping("/generate")
    public JsonNode generateQuestions(
            @RequestParam String jd,
            @RequestParam String resume
    ) {

        // 1. Build prompt
        String prompt = GeminiPrompts.buildQuestionPrompt(jd, resume);

        // 2. Call Gemini AI
        String response = geminiService.generate(prompt);

        // 3. Parse safe JSON
        return jsonParser.parse(response);
    }
}