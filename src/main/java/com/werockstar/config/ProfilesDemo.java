package com.werockstar.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfilesDemo {

    @Bean
    public RandomDemo random(@Value("${random}") String value) {
        RandomDemo demo = new RandomDemo();
        demo.setMessage(value);
        return demo;
    }


    @Bean
    @Profile("prod")
    public RandomDemo random() {
        RandomDemo demo = new RandomDemo();
        demo.setMessage("Prod");
        return demo;
    }
}
