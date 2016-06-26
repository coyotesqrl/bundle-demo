package com.connexta.casterror;

import java.util.Optional;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;

import com.connexta.calculator.Calculator;
import com.connexta.consumer.Consumer;

@Command(scope = "bundemo", name = "cast", description = "Demonstrate Class cast with shared embeds.")
@Service
public class CommandImpl implements Action {
    @Reference
    private BundleContext bundleContext;

    private Calculator calculator;

    private Consumer consumer;

    @Argument(name = "Factor 1", description = "First multiplication factor", index = 0, multiValued = false, required = true)
    protected int factor1;

    @Argument(name = "Factor 2", description = "Second multiplication factor", index = 1, multiValued = false, required = true)
    protected int factor2;

    @Override
    public Object execute() throws Exception {
        initServices();
        return consumer.convertToString(calculator.adder(factor1, factor2));
    }

    private void initServices() throws InvalidSyntaxException {
        if (calculator != null && consumer != null) {
            return;
        }

        calculator = getService(Calculator.class, "(id=library-class)");
        consumer = getService(Consumer.class, "(id=embed-library)");
    }

    private <T> T getService(Class<T> clazz, String filter) throws InvalidSyntaxException {
        if (bundleContext == null) {
            throw new IllegalStateException("BundleContext not initialized");
        }

        Optional<T> t = bundleContext.getServiceReferences(clazz, filter)
                .stream()
                .findFirst()
                .map(sr -> bundleContext.getService(sr));
        if (!t.isPresent()) {
            throw new IllegalStateException(
                    String.format("Service not found with class %s and filter %s", clazz.getName(),
                            filter));
        }

        return t.get();
    }
}
