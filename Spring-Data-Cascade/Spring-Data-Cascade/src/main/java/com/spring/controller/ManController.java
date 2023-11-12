package com.spring.controller;

import com.spring.entity.Man;
import com.spring.repository.ManRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/man")
@RequiredArgsConstructor
public class ManController {

    private final ManRepository manRepository;

    @GetMapping("/man")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(manRepository.findAll());
    }

    @PostMapping("/man")
    public Man insert(@RequestBody Man man) {
        manRepository.save(man);
        return man;
    }

    @PutMapping("/man")
    private Man update(@RequestBody Man man){
        man.setId(man.getId());
        manRepository.save(man);
        return man;
    }

    @DeleteMapping("/man")
    public void deleteById(@RequestParam Long id){
        manRepository.deleteById(id);
    }
}
