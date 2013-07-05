package com.awesomesauce.testapi;

import net.minecraft.workbench.server.entities.*;
import net.minecraft.workbench.server.players.Player;
import java.util.UUID;

public class TestPlayer implements Player
{
  private Entity entity;
  public TestPlayer()
  {
    entity = new TestEntity(this);
  }
  public UUID getUUID()
  {
    return new UUID(1,1);
  }
  public String getUsername()
  {
    return "TestPlayer";
  }
  public String getDisplayName()
  {
    return "TestPlayer";
  }
  public Entity getControlledEntity()
  {
    return entity;
  }
}