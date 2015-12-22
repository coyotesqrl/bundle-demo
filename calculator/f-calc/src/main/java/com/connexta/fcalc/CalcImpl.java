package com.connexta.fcalc;

import com.connexta.calculator.Calculator;
import com.connexta.commons.Wrapper;

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
