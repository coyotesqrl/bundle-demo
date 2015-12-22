package com.connexta.commons;

public class Wrapper {
    private final long value;

    public Wrapper(long l) {
        this.value = l;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
