package com.spring.controller;

import com.spring.entity.Woman;
import com.spring.repository.WomanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/woman")
@RequiredArgsConstructor
public class WomanController {

    private final WomanRepository womanRepository;

    @GetMapping("/woman")
    public List<Woman> findAll() {
        return womanRepository.findAll();
    }
    @PostMapping("/woman")
    public Woman insert(@RequestBody Woman woman){
        womanRepository.save(woman);
        return woman;
    }
    @DeleteMapping("/woman")
    public Woman deleteById(@RequestParam Long id){
        Woman woman = womanRepository.findById(id).get();
        womanRepository.deleteById(id);
        return woman;
    }
}
