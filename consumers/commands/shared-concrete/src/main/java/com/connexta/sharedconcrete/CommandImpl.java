package com.connexta.sharedconcrete;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

import com.connexta.calculator.Calculator;
import com.connexta.consumer.Consumer;
import com.connexta.exported.common.Wrapper;

@Command(scope = "bundemo", name = "imported", description = "Using an exported/imported concrete class")
public class CommandImpl extends OsgiCommandSupport {
    private final Calculator<Wrapper> calculator;

    private final Consumer<Wrapper> consumer;

    @Argument(name = "Factor 1", description = "First multiplication factor", index = 0, multiValued = false, required = true)
    protected int factor1;

    @Argument(name = "Factor 2", description = "Second multiplication factor", index = 1, multiValued = false, required = true)
    protected int factor2;

    public CommandImpl(Calculator<Wrapper> calculator, Consumer<Wrapper> consumer) {
        this.calculator = calculator;
        this.consumer = consumer;
    }

    @Override
    protected Object doExecute() throws Exception {
        return consumer.convertToString(calculator.multiplier(factor1, factor2));
    }
}
