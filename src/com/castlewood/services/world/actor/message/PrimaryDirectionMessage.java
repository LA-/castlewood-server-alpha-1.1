package com.castlewood.services.world.actor.message;

import com.castlewood.services.world.actor.MessageAcceptor;
import com.castlewood.services.world.actor.entity.mobile.Direction;
import com.castlewood.services.world.actor.entity.mobile.Directions;

/**
 * The {@link PrimaryDirectionMessage} indicates that the
 * {@link MessageAcceptor} should change its {@link Directions#primary()}
 * {@link Direction}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class PrimaryDirectionMessage extends DirectionMessage
{

	/**
	 * The {@link PrimaryDirectionMessage} is created which a {@link Direction}.
	 * 
	 * @param direction
	 *            The {@link Direction} to change to.
	 */
	public PrimaryDirectionMessage(final Direction direction)
	{
		super(direction);
	}

}
