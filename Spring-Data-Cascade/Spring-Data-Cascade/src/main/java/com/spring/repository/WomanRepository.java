package com.spring.repository;

import com.spring.entity.Woman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WomanRepository extends JpaRepository<Woman, Long> {
}
