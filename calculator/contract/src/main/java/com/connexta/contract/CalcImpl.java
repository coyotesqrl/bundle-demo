package com.connexta.contract;

import com.connexta.calculator.Calculator;
import com.connexta.calculator.GoodWrapper;

public class CalcImpl implements Calculator<GoodWrapper> {
    @Override
    public GoodWrapper adder(int x, int y) {
        return new Wrapper(x + y);
    }

    @Override
    public GoodWrapper multiplier(int x, int y) {
        return new Wrapper(x * y);
    }
}
