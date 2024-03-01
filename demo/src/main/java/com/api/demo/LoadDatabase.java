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
    CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository) {


        return args -> {
            repository.save(new Employee("Aragorn", "Pendragon", "King"));
            repository.save(new Employee("Samwise", "Gamgee", "Best Friend"));

            repository.findAll().forEach(employee -> log.info("Preloaded " + employee));

            orderRepository.save(new Order("LongSword", Status.COMPLETED));
            orderRepository.save(new Order("Crown", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> log.info("Preloaded " + order));


        };
    }
}
