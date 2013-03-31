package com.castlewood.services.world.actor.message;

import com.castlewood.services.world.actor.ActorMessage;
import com.castlewood.services.world.actor.entity.Entity;

public class LocationTranslationMessage implements ActorMessage<Entity>
{

	private Entity recipient;

	private int x;

	private int y;

	private int height;

	public LocationTranslationMessage(Entity recipient, int x, int y, int height)
	{
		this.recipient = recipient;
		this.x = x;
		this.y = y;
		this.height = height;
	}

	@Override
	public Entity recipient()
	{
		return recipient;
	}

	public int x()
	{
		return x;
	}

	public int y()
	{
		return y;
	}

	public int height()
	{
		return height;
	}

}
