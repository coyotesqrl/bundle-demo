package com.connexta.abstractcontractcommand;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

import com.connexta.calculator.AbstractWrapper;
import com.connexta.calculator.Calculator;
import com.connexta.consumer.Consumer;

@Command(scope = "bundemo", name = "byabscontract", description = "A properly defined by-abstract-contract return")
public class CommandImpl extends OsgiCommandSupport {
    private final Calculator<AbstractWrapper> calculator;

    private final Consumer<AbstractWrapper> consumer;

    @Argument(name = "Factor 1", description = "First multiplication factor", index = 0, multiValued = false, required = true)
    protected int factor1;

    @Argument(name = "Factor 2", description = "Second multiplication factor", index = 1, multiValued = false, required = true)
    protected int factor2;

    public CommandImpl(Calculator<AbstractWrapper> calculator, Consumer<AbstractWrapper> consumer) {
        this.calculator = calculator;
        this.consumer = consumer;
    }

    @Override
    protected Object doExecute() throws Exception {
        return consumer.convertToString(calculator.multiplier(factor1, factor2));
    }
}
