package com.connexta.contractcommand;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

import com.connexta.calculator.Calculator;
import com.connexta.calculator.GoodWrapper;
import com.connexta.consumer.Consumer;

@Command(scope = "bundemo", name = "bycontract", description = "A properly defined by-contract return")
public class CommandImpl extends OsgiCommandSupport {
    private final Calculator<GoodWrapper> calculator;

    private final Consumer<GoodWrapper> consumer;

    @Argument(name = "Factor 1", description = "First multiplication factor", index = 0, multiValued = false, required = true)
    protected int factor1;

    @Argument(name = "Factor 2", description = "Second multiplication factor", index = 1, multiValued = false, required = true)
    protected int factor2;

    public CommandImpl(Calculator<GoodWrapper> calculator, Consumer<GoodWrapper> consumer) {
        this.calculator = calculator;
        this.consumer = consumer;
    }

    @Override
    protected Object doExecute() throws Exception {
        return consumer.convertToString(calculator.multiplier(factor1, factor2));
    }
}
