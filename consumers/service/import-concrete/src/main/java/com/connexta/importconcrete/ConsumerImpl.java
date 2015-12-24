package com.connexta.importconcrete;

import com.connexta.consumer.Consumer;
import com.connexta.exported.common.Wrapper;

/**
 * Demonstrates the import of a shared concrete resource.
 * This should be done sparingly and with full knowledge of the coupling that is occurring.
 */
public class ConsumerImpl implements Consumer<Wrapper> {
    @Override
    public String convertToString(Wrapper input) {
        return String.format("Class: %s%nValue: %d", input.getClass(), input.getValue());
    }
}
