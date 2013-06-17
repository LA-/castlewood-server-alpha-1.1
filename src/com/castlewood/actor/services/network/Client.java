package com.castlewood.actor.services.network;

import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import net.burtleburtle.bob.rand.IsaacRandom;

import com.castlewood.actor.MessageAcceptor;
import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * The {@link Client} is used as a gateway between the server and the connecting
 * user.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class Client implements MessageAcceptor<NetworkMessage>
{

	/**
	 * This {@link AttributeKey} is used for getting the {@link Client}
	 * connected to the {@link Channel}.
	 */
	public static final AttributeKey<Client> KEY = new AttributeKey<>(
			"Client.KEY");

	/**
	 * The {@link Channel} is used to communicate with the {@link Client}.
	 */
	private Channel channel;

	/**
	 * The {@link IsaacRandom} is used to encrypt the header of a
	 * {@link NetworkMessage}.
	 */
	private IsaacRandom encoder;

	/**
	 * The {@link IsaacRandom} is used to decode the header of a
	 * {@link NetworkMessage}.
	 */
	private IsaacRandom decoder;

	/**
	 * This gets the {@link IsaacRandom} used to encrypt the header of a
	 * {@link NetworkMessage}.
	 * 
	 * @return The {@link IsaacRandom}.
	 */
	public IsaacRandom encoder()
	{
		return this.encoder;
	}

	/**
	 * This gets the {@link IsaacRandom} used to decode the header of a
	 * {@link NetworkMessage}.
	 * 
	 * @return The {@link IsaacRandom}.
	 */
	public IsaacRandom decoder()
	{
		return this.decoder;
	}

	@Override
	public void accept(final NetworkMessage message)
	{
		this.channel.write(message);
	}

}
