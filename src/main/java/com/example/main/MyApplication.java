package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.controller")
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.repository")
@ComponentScan("com.example.service")
public class MyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(MyApplication.class, args);
    }


}
