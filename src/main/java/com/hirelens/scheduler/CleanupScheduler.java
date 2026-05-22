package com.hirelens.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CleanupScheduler {

    @Scheduled(fixedRate = 3600000)
    public void clean() {
        System.out.println("Running cleanup job: removing expired assessments...");
    }
}
