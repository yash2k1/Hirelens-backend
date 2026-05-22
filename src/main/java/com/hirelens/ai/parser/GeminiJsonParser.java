package com.hirelens.ai.parser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class GeminiJsonParser {

    private final ObjectMapper mapper = new ObjectMapper();

   public JsonNode parse(String response) {
    try {
        int start = response.indexOf("[");
        int end = response.lastIndexOf("]");

        if (start == -1 || end == -1) {
            throw new RuntimeException("Invalid Gemini response");
        }

        String json = response.substring(start, end + 1);
        return mapper.readTree(json);

    } catch (Exception e) {
        throw new RuntimeException("Parsing failed: " + e.getMessage());
    }
}
}
