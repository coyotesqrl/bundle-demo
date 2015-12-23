package com.connexta.localconcrete;

/**
 * Including a concrete implementation in a service package is an error.
 * It may work, but introduces tight coupling between the service interface and its consumers.
 * Consumers of the service should only know about the <em>contract</em> of the service, not its
 * implementation.
 * <p>
 * If a complex type needs to be passed between a service and its consumers, it should be defined
 * at the API level as an interface. Service implementers would then be responsible for also
 * implementing the complex-type interface.
 */
public class Wrapper {
    private final long value;

    public Wrapper(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
