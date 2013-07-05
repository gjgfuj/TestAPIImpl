package com.awesomesauce.testapi;
import net.minecraft.workbench.server.Server;
import net.minecraft.workbench.server.players.BanList;
public class TestServer implements Server
{
    public TestServer()
    {
	
    }
    private BanList aBanlist;
    public BanList getBanList()
    {
      return aBanlist;
    }
    public void setBanList(BanList banlist)
    {
      aBanlist = banlist;
    }
}