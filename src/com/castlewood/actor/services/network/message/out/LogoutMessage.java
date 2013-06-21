package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This sends a message for the client to logout of the game.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class LogoutMessage extends NetworkMessage
{

	/**
	 * This is a pre-encoded buffer. It is unnecessary to recreate the buffer as
	 * it is constant.
	 */
	private static final ByteBuf buffer = Unpooled.buffer(1).writeByte(109);

	@Override
	public ByteBuf encode()
	{
		return LogoutMessage.buffer;
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
