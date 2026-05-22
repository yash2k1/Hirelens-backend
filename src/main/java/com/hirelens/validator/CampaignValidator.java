package com.hirelens.validator;

import org.springframework.stereotype.Component;

@Component
public class CampaignValidator {

    public boolean isValid(String jd) {
        return jd != null && jd.length() > 20;
    }
}
