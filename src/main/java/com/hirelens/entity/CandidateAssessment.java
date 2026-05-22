package com.hirelens.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "candidate_assessments")
public class CandidateAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String candidateEmail;

    private String assessmentName;

    private Integer totalQuestions;

    private Integer score;

    private String status;

    private LocalDateTime createdAt;

    public CandidateAssessment() {
        this.createdAt = LocalDateTime.now();
    }

    public CandidateAssessment(
            Long id,
            String candidateEmail,
            String assessmentName,
            Integer totalQuestions,
            Integer score,
            String status,
            LocalDateTime createdAt
    ) {
        this.id = id;
        this.candidateEmail = candidateEmail;
        this.assessmentName = assessmentName;
        this.totalQuestions = totalQuestions;
        this.score = score;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }

    public String getAssessmentName() {
        return assessmentName;
    }

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    public Integer getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(Integer totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}