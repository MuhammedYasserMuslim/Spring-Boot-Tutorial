package com.spring.db;

import com.spring.entity.Man;
import com.spring.repository.ManRepository;
import com.spring.repository.WomanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class StartUp implements CommandLineRunner {

    private final ManRepository manRepository;
    private final WomanRepository womanRepository;

    @Override
    public void run(String... args) throws Exception {

//        Man man = Man.builder()
//                .name("Muhammed Yasser")
//                .age(22)
//                .Salary(1200.0)
//                .woman(womanRepository.findById(1L).get())
//                .build();
//
//        manRepository.save(man);


    }
}
