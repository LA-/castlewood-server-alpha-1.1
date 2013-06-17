package com.castlewood.actor.services.world.entity.mobile.player;

import io.netty.util.AttributeKey;

import com.castlewood.actor.services.network.Client;
import com.castlewood.actor.services.world.entity.mobile.MobileEntity;

/**
 * The {@link Player} represents a {@link Client}. The {@link Player} differs in
 * the {@link Client} is used for I/O communications.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class Player extends MobileEntity
{

	public static final AttributeKey<Player> KEY = new AttributeKey<>(
			"Player.KEY");

}
