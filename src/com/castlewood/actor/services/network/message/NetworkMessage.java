package com.castlewood.actor.services.network.message;

import io.netty.buffer.ByteBuf;

import com.castlewood.actor.Message;
import com.castlewood.actor.MessageAcceptor;
import com.castlewood.actor.services.network.Client;

/**
 * A {@link NetworkMessage} is used to encode and decode data transferred
 * between the server and client.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public abstract class NetworkMessage implements Message
{

	/**
	 * Default no-args constructor used to create new {@link NetworkMessage}
	 * instances.
	 */
	public NetworkMessage()
	{

	}

	/**
	 * This is used to encode the implementing {@link NetworkMessage} data into
	 * the buffer.
	 * 
	 * @return {@link NetworkMessage#buffer} with the data encoded into it.
	 */
	public abstract ByteBuf encode();

	/**
	 * This is used to decode data from a {@link ByteBuf} sent from the
	 * {@link Client}.
	 * 
	 * @param buffer
	 *            The {@link ByteBuf} containing data to be decoded.
	 */
	public abstract void decode(ByteBuf buffer);

	@Override
	public Class<? extends MessageAcceptor<?>> acceptor()
	{
		return Client.class;
	}

}
