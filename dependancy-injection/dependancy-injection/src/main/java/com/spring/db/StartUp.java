package com.spring.db;

import com.spring.services.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartUp implements CommandLineRunner {

    Logger log = LoggerFactory.getLogger(StartUp.class);

    @Autowired
    private Services services;
    @Override
    public void run(String... args) throws Exception {
        log.info("count"+services.count());
    }
}
