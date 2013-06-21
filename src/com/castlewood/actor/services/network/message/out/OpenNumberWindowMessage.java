package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This opens a chatbox window that prompts for a number.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class OpenNumberWindowMessage extends NetworkMessage
{

	/**
	 * This is a pre-encoded buffer. It is unnecessary to recreate the buffer as
	 * it is constant.
	 */
	private static ByteBuf buffer = Unpooled.buffer(1).writeByte(27);

	@Override
	public ByteBuf encode()
	{
		return OpenNumberWindowMessage.buffer;
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
