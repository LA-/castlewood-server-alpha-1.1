package com.castlewood.actor.services.world.entity.mobile;

import com.castlewood.actor.services.world.message.LocationTranslationMessage;

/**
 * A {@link Direction} represents a coordinate translation change using the
 * compass directions.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public enum Direction
{

	NONE(0, 0),

	NORTH(0, 1),

	NORTH_EAST(1, 1),

	EAST(1, 0),

	SOUTH_EAST(1, -1),

	SOUTH(0, -1),

	SOUTH_WEST(-1, -1),

	WEST(-1, 0),

	NORTH_WEST(-1, 1);

	/**
	 * A {@link Direction} can be used as a {@link LocationTranslationMessage}.
	 */
	private LocationTranslationMessage translation;

	/**
	 * A {@link Direction} has an x coordinate translation and a y coordinate
	 * translation. This corresponds to the compass points where
	 * {@link Direction#EAST} increases the x value by 1 and
	 * {@link Direction#NORTH} increases the y value by 1.
	 * 
	 * @param x
	 *            The x coordinate translation value.
	 * @param y
	 *            The y coordinate translation value.
	 */
	private Direction(final int x, final int y)
	{
		this.translation = new LocationTranslationMessage(x, y, 0);
	}

	/**
	 * This gets the {@link LocationTranslationMessage} that corresponds with
	 * the {@link Direction}.
	 * 
	 * @return The {@link LocationTranslationMessage}.
	 */
	public LocationTranslationMessage translation()
	{
		return this.translation;
	}

}
