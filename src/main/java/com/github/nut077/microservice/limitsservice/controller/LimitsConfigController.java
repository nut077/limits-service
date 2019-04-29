package com.github.nut077.microservice.limitsservice.controller;

import com.github.nut077.microservice.limitsservice.bean.LimitConfig;
import com.github.nut077.microservice.limitsservice.config.property.ConfigProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class LimitsConfigController {

    private final ConfigProperty configProperty;

    @GetMapping("/limits")
    public LimitConfig retrieveLimitsFromConfigurations() {
        return new LimitConfig(configProperty.getMinimum(), configProperty.getMaximum());
    }
}
