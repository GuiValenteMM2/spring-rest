package com.api.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {


        return args -> {
            log.info("Preloading" + repository.save(new Employee("Aragorn", "Pendragon", "King")));
            log.info("Preloading" + repository.save(new Employee("Samwise", "Gamgee", "Best Friend")));
        };
    }
}
