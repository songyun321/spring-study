package com.spring.AOP;

public class HelloImpl implements Hello {
    @Override
    public String getHello() {
        return "Hello, spring AOP";
    }
}
