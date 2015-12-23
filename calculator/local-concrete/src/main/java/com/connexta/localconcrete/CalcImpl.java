package com.connexta.localconcrete;

import com.connexta.calculator.Calculator;

public class CalcImpl implements Calculator<Wrapper> {
    @Override
    public Wrapper adder(int x, int y) {
        return new Wrapper((long) x + y);
    }

    @Override
    public Wrapper multiplier(int x, int y) {
        return new Wrapper((long) x * y);
    }
}
