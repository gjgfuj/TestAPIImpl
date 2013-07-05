package com.awesomesauce.testapi;
import net.minecraft.workbench.server.players.*;
import java.util.Map;
class TestBanList implements BanList
{
	private Map<String, BanEntry> entries;
    public boolean isEnabled()
    {
    	return true;
    }
    public void setEnabled(boolean enabled)
    {
    	
    }
    public Map<String, BanEntry> getEntries()
    {
    	return entries;
    }
    public boolean isBanned(String name)
    {
    	return false;
    }
    public void add(BanEntry entry)
    {
    	
    }
    public BanEntry remove(String name)
    {
    	return new TestBanEntry();
    }
}