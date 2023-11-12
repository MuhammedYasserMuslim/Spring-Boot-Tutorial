package com.spring.controller;


import com.spring.entity.Employee;
import com.spring.services.Services;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MainController {

    private final Services services;

    @GetMapping
    public Long count() {
        return services.count();
    }

    @GetMapping(value = "/emp")
    public Optional<Employee> findById(@RequestParam Long id) {
        if (services.findById(id).isEmpty())
            throw new RuntimeException("The id " + id + " id Not Found ");
        return services.findById(id);
    }
}
