package com.castlewood.services.world.actor.message;

import com.castlewood.services.world.actor.MessageAcceptor;
import com.castlewood.services.world.actor.entity.mobile.Direction;
import com.castlewood.services.world.actor.entity.mobile.Directions;

/**
 * The {@link SecondaryDirectionMessage} indicates that the
 * {@link MessageAcceptor} should change its {@link Directions#secondary()}
 * {@link Direction}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class SecondaryDirectionMessage extends DirectionMessage
{

	/**
	 * The {@link SecondaryDirectionMessage} is created which a
	 * {@link Direction}.
	 * 
	 * @param direction
	 *            The {@link Direction} to change to.
	 */
	public SecondaryDirectionMessage(final Direction direction)
	{
		super(direction);
	}

}
