package com.spring.db;

import com.spring.entity.Child;
import com.spring.repository.ChildRepository;
import com.spring.repository.ManRepository;
import com.spring.repository.WomanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartUpApp implements CommandLineRunner {

    private final ChildRepository childRepository;
    private final ManRepository manRepository;
    private final WomanRepository womanRepository;

    @Override
    public void run(String... args) throws Exception {

        if (childRepository.count()==0) {
            Child child = Child.builder()
                    .name("Tarek")
                    .age(1)
                    .man(manRepository.findById(3L).get())
                    .woman(womanRepository.findById(3L).get())
                    .build();
            childRepository.save(child);
        }
    }
}
