package com.awesomesauce.testapi;

import java.util.List;

import net.minecraft.workbench.*;
import net.minecraft.workbench.plugin.Plugin;
import net.minecraft.workbench.server.Server;

public class TestAPI extends WorkbenchImpl
{
  private Server server;
  private List<Plugin> plugins;
  public TestAPI()
  {
    server = new TestServer();
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
  @Override
  public void registerPlugin(Plugin plugin) {
    plugins.add(plugin);
  }
}