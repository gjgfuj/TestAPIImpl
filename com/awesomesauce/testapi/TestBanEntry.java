package com.awesomesauce.testapi;
import net.minecraft.workbench.server.players.*;
import java.util.Date;
class TestBanEntry implements BanEntry
{
	private String name;
	private Date created;
	private String source;
	private Date expires;
	private String reason;
	public TestBanEntry(String aname)
	{
	    name = aname;
	    created = new Date();
	    source = "Unknown";
	    expires = null;
	    reason = "Banned from the server.";
	}
	public String getName()
	{
		return name;
	}
	public Date getCreated()
	{
		return created;
	}
	public void setCreated(Date acreated)
	{
		created = acreated;
	}
	public String getSource()
	{
		return source;
	}
	public void setSource(String asource)
	{
		source = asource;
	}
	public Date getExpires()
	{
		return expires;
	}
	public void setExpires(Date aexpires)
	{
		expires = aexpires;
	}
	public boolean hasExpired()
	{
		return new Date().after(expires);
	}
	public String getReason()
	{
		return reason;
	}
	public void setReason(String areason)
	{
		reason = areason;
	}
}