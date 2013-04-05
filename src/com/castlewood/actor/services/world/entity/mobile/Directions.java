package com.castlewood.actor.services.world.entity.mobile;

import com.castlewood.actor.MessageAcceptor;
import com.castlewood.actor.services.world.message.DirectionMessage;
import com.castlewood.actor.services.world.message.PrimaryDirectionMessage;
import com.castlewood.actor.services.world.message.SecondaryDirectionMessage;

/**
 * A set {@link Directions} contains a {@link Directions#primary} directions, or
 * the walking direction, and the {@link Directions#secondary} direction, or the
 * running direction.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class Directions implements MessageAcceptor<DirectionMessage>
{

	/**
	 * The walking {@link Direction}.
	 */
	private Direction primary = Direction.NONE;

	/**
	 * The running {@link Direction}.
	 */
	private Direction secondary = Direction.NONE;

	@Override
	public void accept(final DirectionMessage message)
	{
		if (message instanceof PrimaryDirectionMessage)
		{
			this.primary = message.direction();
		}
		else if (message instanceof SecondaryDirectionMessage)
		{
			this.secondary = message.direction();
		}
	}

	/**
	 * This gets the primary walking {@link Direction}.
	 * 
	 * @return The {@link Direction}.
	 */
	public Direction primary()
	{
		return this.primary;
	}

	/**
	 * This gets the secondary running {@link Direction}.
	 * 
	 * @return The {@link Direction}.
	 */
	public Direction secondary()
	{
		return this.secondary;
	}

}
