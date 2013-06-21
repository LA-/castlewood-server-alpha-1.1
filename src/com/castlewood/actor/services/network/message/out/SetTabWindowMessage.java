package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This sets the interface for a sidebar tab.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class SetTabWindowMessage extends NetworkMessage
{

	/**
	 * The interface id.
	 */
	private final int window;

	/**
	 * The sidebar tab.
	 */
	private final int tab;

	/**
	 * A {@link SetTabWindowMessage} sets the interface id for the sidebar tab.
	 * 
	 * @param window
	 *            The interface id.
	 * @param tab
	 *            The sidebar tab.
	 */
	public SetTabWindowMessage(final int window, final int tab)
	{
		this.window = window;
		this.tab = tab;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(4).writeByte(71).writeShort(this.window)
				.writeByte(this.tab);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
