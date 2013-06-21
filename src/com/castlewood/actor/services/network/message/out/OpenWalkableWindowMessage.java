package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This opens a window where the player will still be able to walk.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class OpenWalkableWindowMessage extends NetworkMessage
{

	/**
	 * The interface id.
	 */
	private final int window;

	/**
	 * A {@link OpenWalkableWindowMessage} is used to open a window where the
	 * player will still be able to walk.
	 * 
	 * @param window
	 *            The interface id.
	 */
	public OpenWalkableWindowMessage(final int window)
	{
		this.window = window;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(3).writeByte(208).writeShort(this.window);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
