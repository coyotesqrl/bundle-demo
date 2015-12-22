package com.connexta.badembed;

import com.connexta.commons.Wrapper;
import com.connexta.consumer.Consumer;

public class ConsumerImpl implements Consumer<Wrapper> {
    @Override
    public String convertToString(Wrapper input) {
        return String.format("Class: %s, value: %d%n", input.getClass(), input.getValue());
    }
}
