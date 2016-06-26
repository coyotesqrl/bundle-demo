package com.connexta.embedbundle;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;

import com.connexta.calculator.Calculator;
import com.connexta.rootclasswithembed.CalcImpl;

@Command(scope = "bundemo", name = "embedbundle", description = "Don't embed bundles.")
@Service
public class CommandImpl implements Action {

    @Argument(name = "Factor 1", description = "First multiplication factor", index = 0, multiValued = false, required = true)
    protected int factor1;

    @Argument(name = "Factor 2", description = "Second multiplication factor", index = 1, multiValued = false, required = true)
    protected int factor2;

    @Override
    public Object execute() throws Exception {
        Calculator calc = new CalcImpl();
        return calc.multiplier(factor1, factor2);
    }
}
