package com.connexta.byabstractcontract;

import com.connexta.calculator.AbstractWrapper;
import com.connexta.consumer.Consumer;

public class ConsumerImpl implements Consumer<AbstractWrapper> {
    @Override
    public String convertToString(AbstractWrapper input) {
        return String.format("Class: %s%nImplType: %s%nValue: %d", input.getClass(),
                input.getImplTypeAbstract(), input.getValue());
    }
}
