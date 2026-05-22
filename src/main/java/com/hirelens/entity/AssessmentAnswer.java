package com.hirelens.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "assessment_answers")
public class AssessmentAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String candidateEmail;

    @Column(nullable = false)
    private String questionId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String answer;

    private Integer score;

    public AssessmentAnswer() {
    }

    public AssessmentAnswer(
            Long id,
            String candidateEmail,
            String questionId,
            String answer,
            Integer score
    ) {
        this.id = id;
        this.candidateEmail = candidateEmail;
        this.questionId = questionId;
        this.answer = answer;
        this.score = score;
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

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}