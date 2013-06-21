package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This shows the player's head model on an interface component. The head model
 * is taken from a player appearance update.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class ShowPlayerModelOnComponentMessage extends NetworkMessage
{

	/**
	 * The interface component.
	 */
	private final int component;

	/**
	 * A {@link ShowPlayerModelOnComponentMesage} shows the player's head model
	 * on an interface component.
	 * 
	 * @param component
	 *            The interface component.
	 */
	public ShowPlayerModelOnComponentMessage(final int component)
	{
		this.component = component;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(3).writeByte(185).writeShort(this.component);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
