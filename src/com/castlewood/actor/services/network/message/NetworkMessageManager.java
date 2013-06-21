package com.castlewood.actor.services.network.message;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@link NetworkMessageManager} contains utilities for handling
 * {@link NetworkMessage NetworkMessages}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class NetworkMessageManager
{

	/**
	 * This contains the operation code-{@link NetworkMessage} correlations.
	 */
	private static final Map<Integer, Class<? extends NetworkMessage>> MESSAGES = new HashMap<>();

	/**
	 * This contains the {@link NetworkMessage}-{@link NetworkMessageHandler}
	 * correlations.
	 */
	private static final Map<Class<? extends NetworkMessage>, NetworkMessageHandler<? extends NetworkMessage>> HANDLERS = new HashMap<>();

	/**
	 * Default constructor to prevent instantiation.
	 */
	private NetworkMessageManager()
	{

	}

	/**
	 * This creates a new {@link NetworkMessage} based on the operation code.
	 * 
	 * @param opcode
	 *            The operation code.
	 * @return The {@link NetworkMessage}.
	 */
	public static NetworkMessage message(final int opcode)
	{
		try
		{
			return NetworkMessageManager.MESSAGES.get(opcode).newInstance();
		}
		catch (InstantiationException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This gets the {@link NetworkMessageHandler} used to handle the
	 * corresponding {@link NetworkMessage}.
	 * 
	 * @param message
	 *            The {@link NetworkMessage}.
	 * @return The {@link NetworkMessageHandler}.
	 */
	public static <T extends NetworkMessage> NetworkMessageHandler<T> handler(
			final NetworkMessage message)
	{
		return (NetworkMessageHandler<T>) NetworkMessageManager.HANDLERS
				.get(message.getClass());
	}

}
