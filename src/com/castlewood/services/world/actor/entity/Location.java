package com.castlewood.services.world.actor.entity;

import com.castlewood.services.world.actor.Message;
import com.castlewood.services.world.actor.MessageAcceptor;
import com.castlewood.services.world.actor.message.LocationChangeMessage;
import com.castlewood.services.world.actor.message.LocationTranslationMessage;

/**
 * A {@link Location} represents a coordinate on the world map. It can accept a
 * {@link LocationTranslationMessage} which will translate its x, y and height
 * by a given amount or a {@link LocationChangeMessage} which will set the x, y
 * and height to a set amount.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class Location implements MessageAcceptor<LocationTranslationMessage>
{

	/**
	 * The x coordinate that is being represented.
	 */
	private int x;

	/**
	 * The y coordinate that is being represented.
	 */
	private int y;

	/**
	 * The height that is being represented.
	 */
	private int height;

	/**
	 * A {@link Location} is created with a starting x, y and height.
	 * 
	 * @param x
	 *            The x coordinate.
	 * @param y
	 *            The y coordinate.
	 * @param height
	 *            The height.
	 */
	public Location(final int x, final int y, final int height)
	{
		this.x = x;
		this.y = y;
		this.height = height;
	}

	@Override
	public void accept(final LocationTranslationMessage message)
	{
		if (message instanceof LocationChangeMessage)
		{
			this.x = message.x();
			this.y = message.y();
			this.height = message.height();
		}
		else
		{
			this.x += message.x();
			this.y += message.y();
			this.height += message.height();
		}
	}

	/**
	 * A getter is used to protect the coordinate from changing in any fashion
	 * unless specified by a {@link Message}.
	 * 
	 * @return The x coordinate of this {@link Location}.
	 */
	public int x()
	{
		return this.x;
	}

	/**
	 * A getter is used to protect the coordinate from changing in any fashion
	 * unless specified by a {@link Message}.
	 * 
	 * @return The y coordinate of this {@link Location}.
	 */
	public int y()
	{
		return this.y;
	}

	/**
	 * A getter is used to protect the coordinate from changing in any fashion
	 * unless specified by a {@link Message}.
	 * 
	 * @return The height of this {@link Location}.
	 */
	public int height()
	{
		return this.height;
	}

}
