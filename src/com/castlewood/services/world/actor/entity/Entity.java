package com.castlewood.services.world.actor.entity;

import com.castlewood.services.world.actor.MessageAcceptor;
import com.castlewood.services.world.actor.MessageAcceptorCarrier;

/**
 * An {@link Entity} is a {@link MessageAcceptorCarrier} with a {@link Location}
 * .
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class Entity extends MessageAcceptorCarrier
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

}
