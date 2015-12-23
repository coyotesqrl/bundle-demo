package com.connexta.bundexp;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

import com.connexta.calculator.Calculator;
import com.connexta.consumer.Consumer;
import com.connexta.localconcrete.Wrapper;

@Command(scope = "bundemo", name = "export1", description = "Use an embedded bundle with a concrete export.")
public class BundleExport1Command extends OsgiCommandSupport {
    private final Calculator calculator;

    @Argument(name = "Factor 1", description = "First multiplication factor", index = 0, multiValued = false, required = true)
    protected int factor1;

    @Argument(name = "Factor 2", description = "Second multiplication factor", index = 1, multiValued = false, required = true)
    protected int factor2;

    public BundleExport1Command(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    protected Object doExecute() throws Exception {
        return ((Consumer<Wrapper>) input -> String.format("Class: %s%nValue: %s", input.getClass(),
                input.toString())).convertToString(
                (Wrapper) calculator.multiplier(factor1, factor2));
    }
}
