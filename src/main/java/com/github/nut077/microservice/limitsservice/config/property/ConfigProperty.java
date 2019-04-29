package com.github.nut077.microservice.limitsservice.config.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("limits.service")
public class ConfigProperty {

    private int minimum;
    private int maximum;
}
