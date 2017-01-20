package com.werockstar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

    @Bean
    public String message() {
        return "WeRockStar Config";
    }
}
