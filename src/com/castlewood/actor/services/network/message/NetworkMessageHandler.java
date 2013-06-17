package com.castlewood.actor.services.network.message;

import com.castlewood.actor.services.world.entity.mobile.player.Player;

/**
 * The {@link NetworkMessageHandler} is used to handle a decoded
 * {@link NetworkMessageHandler}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 * @param <M>
 *            The {@link NetworkMessage} type that the
 *            {@link NetworkMessageHandler} accepts.
 */
public interface NetworkMessageHandler<M extends NetworkMessage>
{

	/**
	 * This performs actions for the {@link Player} and the
	 * {@link NetworkMessage}.
	 * 
	 * @param player
	 *            The {@link Player}.
	 * @param message
	 *            The {@link NetworkMessage}.
	 */
	public void handle(Player player, M message);

}
