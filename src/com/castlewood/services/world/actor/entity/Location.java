package com.castlewood.services.world.actor.entity;

import com.castlewood.services.world.actor.MessageSpecificActor;
import com.castlewood.services.world.actor.message.LocationTranslationMessage;

public class Location extends
		MessageSpecificActor<Entity, LocationTranslationMessage>
{

	private int x;

	private int y;

	private int height;

	public Location(int x, int y, int height)
	{
		this.x = x;
		this.y = y;
		this.height = height;
	}

	@Override
	protected boolean evaluate(LocationTranslationMessage message)
	{
		x += message.x();
		y += message.y();
		height += message.height();
		return x > 0 && y > 0 && height > 0;
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
