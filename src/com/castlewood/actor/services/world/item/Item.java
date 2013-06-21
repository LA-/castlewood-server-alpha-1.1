package com.castlewood.actor.services.world.item;

import com.castlewood.actor.MessageAcceptor;
import com.castlewood.actor.services.world.message.ItemMessage;

/**
 * An {@link Item} represents a usable entity. It has an id and an amount.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class Item implements MessageAcceptor<ItemMessage>
{

	private final int id;

	private final int amount;

	private final ItemCreationMethod method;

	public Item(final int id, final int amount, final ItemCreationMethod method)
	{
		this.id = id;
		this.amount = amount;
		this.method = method;
	}

	@Override
	public void accept(final ItemMessage message)
	{

	}

	public int id()
	{
		return this.id;
	}

	public int amount()
	{
		return this.amount;
	}

	public ItemCreationMethod method()
	{
		return this.method;
	}

}
