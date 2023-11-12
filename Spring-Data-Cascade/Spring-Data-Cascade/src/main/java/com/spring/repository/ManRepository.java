package com.spring.repository;

import com.spring.entity.Man;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManRepository extends JpaRepository<Man,Long> {
}
