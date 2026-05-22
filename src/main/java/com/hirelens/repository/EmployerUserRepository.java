package com.hirelens.repository;

import com.hirelens.entity.EmployerUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerUserRepository extends JpaRepository<EmployerUser, Long> {
}