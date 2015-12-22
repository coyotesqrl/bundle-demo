package com.connexta.calculator;

public interface Calculator<T> {
    T adder(int x, int y);

    T multiplier(int x, int y);
}