package com.awesomesauce.testapi;

public class Test {
    private net.minecraft.workbench.WorkbenchImpl api;
    private net.minecraft.workbench.server.Server server;
    public Test()
    {
        api = new TestAPI();
        server = api.getServer();
    }
    public void importPlugins() {
        api.registerPlugin(new TestPlugin());
    }
    public void run() {
	
    }
}
