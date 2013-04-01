package com.castlewood.services.world.actor.entity.mobile;

import com.castlewood.services.world.actor.MessageAcceptor;
import com.castlewood.services.world.actor.message.DirectionMessage;
import com.castlewood.services.world.actor.message.PrimaryDirectionMessage;
import com.castlewood.services.world.actor.message.SecondaryDirectionMessage;

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
