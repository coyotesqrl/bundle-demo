package com.connexta.acalc;

import com.connexta.calculator.Calculator;

public class CalcImpl implements Calculator<Long> {
    @Override
    public Long adder(int x, int y) {
        return (long) x + y;
    }

    @Override
    public Long multiplier(int x, int y) {
        return (long) x * y;
    }
}
