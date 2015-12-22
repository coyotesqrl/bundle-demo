package com.connexta.cast;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

import com.connexta.calculator.Calculator;
import com.connexta.consumer.Consumer;

@Command(scope = "bundle", name = "cast", description = "Demonstrate Class cast with shared embeds.")
public class ClassCastCommand extends OsgiCommandSupport {
    private final Calculator calculator;

    private final Consumer consumer;

    @Argument(name = "Factor 1", description = "First multiplication factor", index = 0, multiValued = false, required = true)
    protected int factor1;

    @Argument(name = "Factor 2", description = "Second multiplication factor", index = 1, multiValued = false, required = true)
    protected int factor2;

    public ClassCastCommand(Calculator calculator, Consumer consumer) {
        this.calculator = calculator;
        this.consumer = consumer;
    }

    @Override
    protected Object doExecute() throws Exception {
        return consumer.convertToString(calculator.adder(factor1, factor2));
    }
}
