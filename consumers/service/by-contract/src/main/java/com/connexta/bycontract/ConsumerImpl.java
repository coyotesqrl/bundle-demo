package com.connexta.bycontract;

import com.connexta.calculator.GoodWrapper;
import com.connexta.consumer.Consumer;

public class ConsumerImpl implements Consumer<GoodWrapper> {
    @Override
    public String convertToString(GoodWrapper input) {
        return String.format("Class: %s%nImplType: %s%nValue: %d", input.getClass(),
                input.getImplTypeDefault(), input.getValue());
    }
}
