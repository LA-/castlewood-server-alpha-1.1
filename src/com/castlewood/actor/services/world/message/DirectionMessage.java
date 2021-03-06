package com.castlewood.actor.services.world.message;

import com.castlewood.actor.Message;
import com.castlewood.actor.MessageAcceptor;
import com.castlewood.actor.services.world.entity.mobile.Direction;
import com.castlewood.actor.services.world.entity.mobile.Directions;

/**
 * A {@link DirectionMessage} contains a single {@link Direction}. This will
 * change the {@link MessageAcceptor}'s {@link Directions}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class DirectionMessage implements Message
{

	/**
	 * The {@link Direction} to change to.
	 */
	private final Direction direction;

	/**
	 * A {@link DirectionMessage} is created with a {@link Direction}. The
	 * {@link Direction} indicates what the {@link MessageAcceptor} should
	 * change its direction to.
	 * 
	 * @param direction
	 *            The {@link Direction}.
	 */
	public DirectionMessage(final Direction direction)
	{
		this.direction = direction;
	}

	@Override
	public Class<? extends MessageAcceptor<?>> acceptor()
	{
		return Directions.class;
	}

	/**
	 * This gets the {@link Direction} to change to.
	 * 
	 * @return The {@link Direction}.
	 */
	public Direction direction()
	{
		return this.direction;
	}

}
