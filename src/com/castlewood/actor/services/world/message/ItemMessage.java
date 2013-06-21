package com.castlewood.actor.services.world.message;

import com.castlewood.actor.Message;
import com.castlewood.actor.MessageAcceptor;
import com.castlewood.actor.services.world.item.Item;

/**
 * An {@link ItemMessage} is used to notify an {@link Item} of any changes.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class ItemMessage implements Message
{

	@Override
	public Class<? extends MessageAcceptor<?>> acceptor()
	{
		return Item.class;
	}

}
