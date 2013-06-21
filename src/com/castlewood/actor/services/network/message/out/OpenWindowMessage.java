package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This opens a window interface that will be displayed for the client.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class OpenWindowMessage extends NetworkMessage
{

	/**
	 * This interface id of the window to be opened.
	 */
	private final int window;

	/**
	 * A new {@link OpenWindowMessage} is created with the id of the interface
	 * to open.
	 * 
	 * @param window
	 *            The id of the window interface.
	 */
	public OpenWindowMessage(final int window)
	{
		this.window = window;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(3).writeByte(97).writeShort(this.window);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
