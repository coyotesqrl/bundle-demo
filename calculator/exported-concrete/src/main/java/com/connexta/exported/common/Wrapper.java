package com.connexta.exported.common;

/**
 * While it is generally not a good idea to export concrete classes from a bundle, there are
 * rare cases where it is necessary. Primarily when dealing with complex objects that are not
 * easily defined as interfaces, such as JAXB objects.
 */
public class Wrapper {
    private final long value;

    public Wrapper(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}
