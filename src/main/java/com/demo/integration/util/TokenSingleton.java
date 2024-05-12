package com.demo.integration.util;


import org.springframework.stereotype.Component;

@Component
public final class TokenSingleton {

    private static TokenSingleton instance;
    private static String value;

    private TokenSingleton() {

    }

    private TokenSingleton(String token) {

        String value = token;

        this.value = value;
    }

    public static TokenSingleton setNewInstance(String token) {

        instance = new TokenSingleton(token);

        return instance;
    }

    public static String getValue() {

        return value;
    }

}
