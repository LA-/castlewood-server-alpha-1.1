package com.castlewood.services.world.actor.message;

import com.castlewood.services.world.actor.Message;
import com.castlewood.services.world.actor.MessageAcceptor;
import com.castlewood.services.world.actor.entity.Location;

/**
 * The {@link LocationTranslationMessage} is used to translate a
 * {@link Location}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class LocationTranslationMessage implements Message
{

	/**
	 * The x coordinate translation value.
	 */
	private int x;

	/**
	 * The y coordinate translation value.
	 */
	private int y;

	/**
	 * The height translation value.
	 */
	private int height;

	/**
	 * A {@link LocationTranslationMessage} is created with an x translation, y
	 * translation and height translation. Unlike the {@link Location}
	 * {@link Class}, these translations are added to a {@link Location}.
	 * 
	 * @param x
	 *            The x translation value.
	 * @param y
	 *            The y translation value.
	 * @param height
	 *            The height translation value.
	 */
	public LocationTranslationMessage(int x, int y, int height)
	{
		this.x = x;
		this.y = y;
		this.height = height;
	}

	@Override
	public Class<? extends MessageAcceptor<?>> acceptor()
	{
		return Location.class;
	}

	/**
	 * A getter is used to protect the coordinate from changing in any fashion
	 * unless specified by a {@link Message}.
	 * 
	 * @return The x translation value.
	 */
	public int x()
	{
		return x;
	}

	/**
	 * A getter is used to protect the coordinate from changing in any fashion
	 * unless specified by a {@link Message}.
	 * 
	 * @return The y translation value.
	 */
	public int y()
	{
		return y;
	}

	/**
	 * A getter is used to protect the coordinate from changing in any fashion
	 * unless specified by a {@link Message}.
	 * 
	 * @return The height translation value.
	 */
	public int height()
	{
		return height;
	}

}
