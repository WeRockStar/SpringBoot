package com.werockstar.monitor;


import org.springframework.boot.actuate.endpoint.Endpoint;

public class CustomEndpoint implements Endpoint<String> {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean isSensitive() {
        return false;
    }

    @Override
    public String invoke() {
        return null;
    }
}
