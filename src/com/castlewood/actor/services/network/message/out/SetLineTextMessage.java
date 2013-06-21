package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This sets the text message on an interface line.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class SetLineTextMessage extends NetworkMessage
{

	/**
	 * The text message.
	 */
	private final String text;

	/**
	 * The line on the interface.
	 */
	private final int line;

	/**
	 * A {@link SetLineTextMessage} is used to change the text on an interface
	 * line.
	 * 
	 * @param text
	 *            The text message.
	 * @param line
	 *            The interface line.
	 */
	public SetLineTextMessage(final String text, final int line)
	{
		this.text = text;
		this.line = line;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(4 + this.text.length()).writeByte(126)
				.writeBytes(this.text.getBytes()).writeByte('\n')
				.writeShort(this.line);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
