package com.castlewood.services.world.actor.entity;

import com.castlewood.services.world.actor.MessageAcceptor;
import com.castlewood.services.world.actor.MessageAcceptorCarrier;

/**
 * An {@link Entity} is a {@link MessageAcceptorCarrier} with a {@link Location}
 * . An {@link Entity} must be capable of being updated every cycle as well.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public abstract class Entity extends MessageAcceptorCarrier
{

	/**
	 * An {@link Entity} is created with a default {@link Location} at [3200,
	 * 3200, 0].
	 */
	public Entity()
	{
		super(new MessageAcceptor<?>[]
		{
			new Location(3200, 3200, 0)
		});
	}

	/**
	 * This updates the {@link Entity} after every cycle.
	 */
	public abstract void update();

}
