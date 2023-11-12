package com.spring.repository;

import com.spring.entity.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
