package com.sfeir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.default", "dev");
        SpringApplication.run(Application.class, args);
    }

    // TODO  WebSecurityConfig
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
