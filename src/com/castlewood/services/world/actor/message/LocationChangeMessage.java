package com.castlewood.services.world.actor.message;

import com.castlewood.services.world.actor.entity.Location;

/**
 * The {@link LocationChangeMessage} differs from the
 * {@link LocationTranslationMessage} in the aspect that instead of translating
 * a {@link Location}, it will change the {@link Location} to the coordinates
 * given.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class LocationChangeMessage extends LocationTranslationMessage
{

	/**
	 * A {@link LocationChangeMessage} will be created with the coordinates the
	 * {@link Location} should change to.
	 * 
	 * @param x
	 *            The x coordinate value.
	 * @param y
	 *            The y coordinate value.
	 * @param height
	 *            The height value.
	 */
	public LocationChangeMessage(int x, int y, int height)
	{
		super(x, y, height);
	}

}
