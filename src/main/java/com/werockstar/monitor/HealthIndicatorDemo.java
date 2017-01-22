package com.werockstar.monitor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthIndicatorDemo implements HealthIndicator {

    @Override
    public Health health() {
        return Health.down().withDetail("Error Message", "No connection to service").build();
    }
}
