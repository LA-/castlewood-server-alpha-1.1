package com.castlewood.actor.services.world.entity.mobile;

import com.castlewood.actor.services.world.entity.Entity;

/**
 * A {@link MobileEntity} is an {@link Entity} that can move.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class MobileEntity extends Entity
{

	/**
	 * A {@link MobileEntity} is created with a set of {@link Directions} as
	 * well as calling the {@link Entity#Entity()} constructor.
	 */
	public MobileEntity()
	{
		super();
		this.register(new Directions());
	}

	@Override
	public void update()
	{

	}

}
