package com.inductiveautomation.ignition.rivr.scripting.client;

import com.inductiveautomation.ignition.client.gateway_interface.ModuleRPCFactory;
import com.inductiveautomation.ignition.rivr.scripting.AbstractScriptModule;
import com.inductiveautomation.ignition.rivr.scripting.MathBlackBox;
import com.inductiveautomation.ignition.rivr.scripting.PrintRivr;

public class ClientScriptModule extends AbstractScriptModule {

    private final MathBlackBox rpc;
    private final PrintRivr rpc1;

    public ClientScriptModule() {
        rpc = ModuleRPCFactory.create(
            "com.inductiveautomation.ignition.rivr.scripting-function",
            MathBlackBox.class
        );

        rpc1 = ModuleRPCFactory.create(
            "com.inductiveautomation.ignition.rivr.scripting-function",
            PrintRivr.class
        );
    }

    @Override
    protected int multiplyImpl(int arg0, int arg1) {
        return rpc.multiply(arg0, arg1);
    }

    @Override
    protected String printImpl(String arg0) {
        return rpc1.print(arg0);
    }

}
