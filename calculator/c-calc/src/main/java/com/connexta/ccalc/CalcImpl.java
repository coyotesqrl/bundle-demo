package com.connexta.ccalc;

import com.connexta.calculator.Calculator;
import com.google.common.math.LongMath;

public class CalcImpl implements Calculator<Long> {
    @Override
    public Long adder(int x, int y) {
        return LongMath.checkedAdd(x, y);
    }

    @Override
    public Long multiplier(int x, int y) {
        return LongMath.checkedMultiply(x, y);
    }
}
