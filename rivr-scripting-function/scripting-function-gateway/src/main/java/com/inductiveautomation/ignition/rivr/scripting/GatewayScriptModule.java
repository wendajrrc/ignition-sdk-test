package com.inductiveautomation.ignition.rivr.scripting;

public class GatewayScriptModule extends AbstractScriptModule {

    @Override
    protected int multiplyImpl(int arg0, int arg1) {
        return arg0 * arg1;
    }

    @Override
    protected String printImpl(String arg0) {
        return String.join(" ", "RIVR", arg0);
    }
}
