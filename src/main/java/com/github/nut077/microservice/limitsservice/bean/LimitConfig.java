package com.github.nut077.microservice.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LimitConfig {

    private int minimum;
    private int maximum;
}