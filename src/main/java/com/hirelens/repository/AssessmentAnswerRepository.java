package com.hirelens.repository;

import com.hirelens.entity.AssessmentAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssessmentAnswerRepository
        extends JpaRepository<AssessmentAnswer, Long> {
}