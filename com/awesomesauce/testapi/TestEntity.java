package com.awesomesauce.testapi;

import net.minecraft.workbench.server.entities.*;
public class TestEntity implements Entity
{
	public TestEntity(EntityController c)
	{
		controller = c;
	}
	private EntityController controller;
  
	public EntityController getController()
	{
		return controller;
	}
}