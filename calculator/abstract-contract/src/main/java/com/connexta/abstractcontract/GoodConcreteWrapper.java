package com.connexta.abstractcontract;

import com.connexta.calculator.AbstractWrapper;

public class GoodConcreteWrapper extends AbstractWrapper {
    private final long value;

    public GoodConcreteWrapper(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }
}
