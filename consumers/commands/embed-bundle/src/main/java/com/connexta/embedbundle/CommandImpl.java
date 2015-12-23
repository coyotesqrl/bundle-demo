package com.connexta.embedbundle;

import org.apache.felix.gogo.commands.Argument;
import org.apache.felix.gogo.commands.Command;
import org.apache.karaf.shell.console.OsgiCommandSupport;

import com.connexta.calculator.Calculator;
import com.connexta.rootclasswithembed.CalcImpl;

@Command(scope = "bundemo", name = "embedbundle", description = "Don't embed bundles.")
public class CommandImpl extends OsgiCommandSupport {

    @Argument(name = "Factor 1", description = "First multiplication factor", index = 0, multiValued = false, required = true)
    protected int factor1;

    @Argument(name = "Factor 2", description = "Second multiplication factor", index = 1, multiValued = false, required = true)
    protected int factor2;

    @Override
    protected Object doExecute() throws Exception {
        Calculator calc = new CalcImpl();
        return calc.multiplier(factor1, factor2);
    }
}
