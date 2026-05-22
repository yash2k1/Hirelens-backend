package com.hirelens.controller;

import com.hirelens.entity.AssessmentAnswer;
import com.hirelens.service.AssessmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assessment")
public class AssessmentController {

    private final AssessmentService assessmentService;

    public AssessmentController(
            AssessmentService assessmentService
    ) {
        this.assessmentService = assessmentService;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Assessment Service Running";
    }

    @PostMapping("/submit")
    public AssessmentAnswer submitAnswer(
            @RequestBody AssessmentAnswer answer
    ) {
        return assessmentService.saveAnswer(answer);
    }

    @GetMapping("/all")
    public List<AssessmentAnswer> getAllAnswers() {
        return assessmentService.getAllAnswers();
    }
}