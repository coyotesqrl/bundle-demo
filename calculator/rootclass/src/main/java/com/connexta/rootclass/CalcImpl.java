package com.connexta.rootclass;

import com.connexta.calculator.Calculator;

/**
 * This is a well-formed service implementation.
 * <p>
 * Its inputs and outputs are loaded by the root classloader and guaranteed to be available to all
 * consumers. It does not require coupling between consumers and implementors.
 */
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
