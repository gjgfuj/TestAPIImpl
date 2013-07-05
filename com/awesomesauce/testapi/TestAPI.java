package com.awesomesauce.testapi;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.workbench.*;
import net.minecraft.workbench.plugin.Plugin;
import net.minecraft.workbench.server.Server;

public class TestAPI extends WorkbenchImpl
{
    private Server server;
    public List<Plugin> plugins;
    public TestAPI(Test game)
    {
        server = new TestServer();
        plugins = new ArrayList<Plugin>();
        Workbench.setInstance(this); 
    }
    public String getImplementationName()
    {
        return "Test API";
    }
    public String getImplementationVersion()
    {
        return "0.0.1";
    }
    public Server getServer()
    {
        return server;
    }
    public void tickPlugins()
    {
        for (int i=0;i < plugins.size(); i++)
        {
	    plugins.get(i).tick();
        }
    }
    @Override
    public void registerPlugin(Plugin plugin) {
        plugins.add(plugin);
    }
    @Override
    public void log(Plugin plugin, String string)
    {
   	System.out.println("[".concat(plugin.getName().concat("] ".concat(string))));
   	
    }
    
}