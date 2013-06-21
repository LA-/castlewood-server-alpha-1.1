package com.castlewood.actor.services.world.item;

import java.util.Date;

/**
 * The {@link ItemCreationMethod} is used to detect items that are fraudly
 * created.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class ItemCreationMethod
{

	/**
	 * The {@link Date} of creation.
	 */
	private final Date created = new Date();

	/**
	 * The amount of the item created.
	 */
	private final int amount;

	/**
	 * A {@link ItemCreationMethod} is used to indicate the date of the item
	 * created and how many of it was created.
	 * 
	 * @param amount
	 *            The amount created.
	 */
	public ItemCreationMethod(int amount)
	{
		this.amount = amount;
	}

	/**
	 * This gets the {@link Date} of when the {@link Item} was created.
	 * 
	 * @return The {@link Date}.
	 */
	public Date created()
	{
		return this.created;
	}

	/**
	 * This gets the amount of the item created.
	 * 
	 * @return The amount.
	 */
	public int amount()
	{
		return amount;
	}

}
