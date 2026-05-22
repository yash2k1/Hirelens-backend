package com.hirelens.service;

import com.hirelens.entity.AssessmentAnswer;
import com.hirelens.repository.AssessmentAnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {

    private final AssessmentAnswerRepository assessmentAnswerRepository;

    public AssessmentService(
            AssessmentAnswerRepository assessmentAnswerRepository
    ) {
        this.assessmentAnswerRepository = assessmentAnswerRepository;
    }

    public AssessmentAnswer saveAnswer(
            AssessmentAnswer assessmentAnswer
    ) {
        return assessmentAnswerRepository.save(assessmentAnswer);
    }

    public List<AssessmentAnswer> getAllAnswers() {
        return assessmentAnswerRepository.findAll();
    }
}