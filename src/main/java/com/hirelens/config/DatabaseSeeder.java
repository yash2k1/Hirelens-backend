package com.hirelens.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("HireLens DB Seeder Initialized...");
    }
}