package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This sets the colour of a line on an interface.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class SetLineColourMessage extends NetworkMessage
{

	/**
	 * The line on an interface.
	 */
	private final int line;

	/**
	 * The colour to change the text on the line.
	 */
	private final int colour;

	/**
	 * A {@link SetLineColourMessage} is used to change the colour
	 * 
	 * @param line
	 *            The line on the interface.
	 * @param colour
	 *            The colour in hex.
	 */
	public SetLineColourMessage(final int line, final int colour)
	{
		this.line = line;
		this.colour = colour;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(5).writeByte(200).writeShort(this.line)
				.writeShort(this.colour);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
