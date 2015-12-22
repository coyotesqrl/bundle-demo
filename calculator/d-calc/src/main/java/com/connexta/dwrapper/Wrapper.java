package com.connexta.dwrapper;

public class Wrapper {
    private final long value;

    public Wrapper(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
