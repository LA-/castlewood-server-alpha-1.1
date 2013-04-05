package com.castlewood.actor.services.world.message;

import com.castlewood.actor.MessageAcceptor;
import com.castlewood.actor.services.world.entity.mobile.Direction;
import com.castlewood.actor.services.world.entity.mobile.Directions;

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
