package com.connexta.contract;

import com.connexta.calculator.GoodWrapper;

public class Wrapper implements GoodWrapper {
    private final long value;

    public Wrapper(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }
}
