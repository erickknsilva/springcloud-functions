package com.coffeandit.springcloud_functions.springcloud_functions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringcloudFunctionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFunctionsApplication.class, args);
    }

    @Bean
    public Function<String, String> validarCpf() {
        return cpf -> {
            if (cpf != null && cpf.matches("\\d{11}")) {
                return "CPF válido: " + cpf;
            } else {
                return "CPF inválido";
            }
        };
    }

}
