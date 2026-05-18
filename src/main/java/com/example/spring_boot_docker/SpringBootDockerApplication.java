package com.example.spring_boot_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // 1. Add this annotation
public class SpringBootDockerApplication {

    public static void main(String[] args) {
    SpringApplication.run(SpringBootDockerApplication.class, args);
    }

    @GetMapping("/") // 2. Map this method to the root URL
    public String home() {
        return "Hello, Docker and Spring Boot are working!";
    }

}
