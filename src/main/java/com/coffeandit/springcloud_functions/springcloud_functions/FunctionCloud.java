package com.coffeandit.springcloud_functions.springcloud_functions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class FunctionCloud {

    @Bean
    public Function<String, Boolean> validarCpf() {
        return value -> ValidaCPF.isCPF(value);
    }
}
