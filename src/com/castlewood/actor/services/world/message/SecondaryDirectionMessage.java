package com.castlewood.actor.services.world.message;

import com.castlewood.actor.MessageAcceptor;
import com.castlewood.actor.services.world.entity.mobile.Direction;
import com.castlewood.actor.services.world.entity.mobile.Directions;

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
