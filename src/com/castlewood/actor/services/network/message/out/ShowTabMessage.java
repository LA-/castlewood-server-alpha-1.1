package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This forces the client to switch to a sidebar tab.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class ShowTabMessage extends NetworkMessage
{

	/**
	 * The sidebar tab.
	 */
	private final int tab;

	/**
	 * A {@link ShowTabMessage} is used to force the client to view a sidebar
	 * tab.
	 * 
	 * @param tab
	 *            The sidebar tab.
	 */
	public ShowTabMessage(final int tab)
	{
		this.tab = tab;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(2).writeByte(106).writeByte(this.tab);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
