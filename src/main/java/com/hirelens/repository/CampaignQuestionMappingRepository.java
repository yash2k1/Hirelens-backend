package com.hirelens.repository;

import com.hirelens.entity.CampaignQuestionMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignQuestionMappingRepository extends JpaRepository<CampaignQuestionMapping, Long> {
}