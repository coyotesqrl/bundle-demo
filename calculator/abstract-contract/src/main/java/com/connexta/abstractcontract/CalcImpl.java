package com.connexta.abstractcontract;

import com.connexta.calculator.Calculator;

public class CalcImpl implements Calculator<GoodConcreteWrapper> {
    @Override
    public GoodConcreteWrapper adder(int x, int y) {
        return new GoodConcreteWrapper(x + y);
    }

    @Override
    public GoodConcreteWrapper multiplier(int x, int y) {
        return new GoodConcreteWrapper(x * y);
    }
}
