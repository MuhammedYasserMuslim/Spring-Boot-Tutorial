package com.spring.services;

import com.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Services {

    @Autowired
    private JpaRepository jpaRepository;

    public Long count(){
        return jpaRepository.count();
    }
    public Optional<Employee> findById(Long id){
        return jpaRepository.findById(id);
    }
}
