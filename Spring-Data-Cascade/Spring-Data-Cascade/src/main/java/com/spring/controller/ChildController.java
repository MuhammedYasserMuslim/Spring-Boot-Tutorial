package com.spring.controller;


import com.spring.dto.ChildDto;
import com.spring.entity.Child;
import com.spring.repository.ChildRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/child")
@RequiredArgsConstructor
public class ChildController {

    private final ChildRepository childRepository;

    private final ModelMapper modelMapper;

    @GetMapping("/child")
    public List<Child> findAll() {
       return childRepository.findAll();
    }

    @PostMapping("/child")
    public Child insert(@RequestBody Child child) {
        childRepository.save(child);
        return child;
    }

    @PutMapping("/child")
    private Child update(@RequestBody Child child) {
        child.setId(child.getId());
        childRepository.save(child);
        return child;
    }

    @DeleteMapping("/child")
    public void deleteById(@RequestParam Long id) {
        childRepository.deleteById(id);
    }
}
