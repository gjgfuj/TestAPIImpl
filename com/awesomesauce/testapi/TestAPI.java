package com.awesomesauce.testapi;

import net.minecraft.workbench.*;
import net.minecraft.workbench.server.Server;

public class TestAPI extends WorkbenchImpl
{
  private Server server;
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
}