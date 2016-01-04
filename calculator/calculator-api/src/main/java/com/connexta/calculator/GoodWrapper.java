package com.connexta.calculator;

public interface GoodWrapper {
    long getValue();

    default String getImplTypeDefault() {
        return "I'm a default method - ";
    }
}
