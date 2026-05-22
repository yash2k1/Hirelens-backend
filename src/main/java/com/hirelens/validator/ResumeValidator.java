package com.hirelens.validator;

import org.springframework.stereotype.Component;

@Component
public class ResumeValidator {

    public boolean isValid(String resume) {
        return resume != null && resume.length() > 50;
    }
}
