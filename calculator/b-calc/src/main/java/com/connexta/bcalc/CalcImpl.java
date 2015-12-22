package com.connexta.bcalc;

import java.math.BigInteger;

import com.connexta.calculator.Calculator;

public class CalcImpl implements Calculator<BigInteger> {
    @Override
    public BigInteger adder(int x, int y) {
        return new BigInteger(String.valueOf(x + y));
    }

    @Override
    public BigInteger multiplier(int x, int y) {
        return new BigInteger(String.valueOf((long) x * y));
    }
}
