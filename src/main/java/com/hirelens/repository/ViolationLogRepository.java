package com.hirelens.repository;

import com.hirelens.entity.ViolationLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViolationLogRepository extends JpaRepository<ViolationLog, Long> {
}