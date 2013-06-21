package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This is sent to the client to remove all open interfaces/
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class RemoveWindowsMessage extends NetworkMessage
{

	/**
	 * This is a pre-encoded buffer. It is unnecessary to recreate the buffer as
	 * it is constant.
	 */
	private static final ByteBuf buffer = Unpooled.buffer(1).writeByte(219);

	@Override
	public ByteBuf encode()
	{
		return RemoveWindowsMessage.buffer;
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
