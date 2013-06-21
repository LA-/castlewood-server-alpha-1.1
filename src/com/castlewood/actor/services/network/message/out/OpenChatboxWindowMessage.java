package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This shows a window over the chatbox area.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class OpenChatboxWindowMessage extends NetworkMessage
{

	/**
	 * The window id to open.
	 */
	private final int window;

	/**
	 * A {@link OpenChatboxWindowMessage} displays an interface over the chatbox
	 * area.
	 * 
	 * @param window
	 *            The interface id.
	 */
	public OpenChatboxWindowMessage(final int window)
	{
		this.window = window;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(3).writeByte(164).writeShort(this.window);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
