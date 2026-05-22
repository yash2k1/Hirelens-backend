package com.hirelens.service;

import org.springframework.stereotype.Service;

@Service
public class SkillExtractionService {

    public String extract(String text) {
        if (text == null) return "";
        return text.toLowerCase();
    }
}
