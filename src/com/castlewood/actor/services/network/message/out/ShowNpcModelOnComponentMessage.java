package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This shows a non-player-character's head model on an interface component.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class ShowNpcModelOnComponentMessage extends NetworkMessage
{

	/**
	 * The npc id.
	 */
	private final int npc;

	/**
	 * The interface component.
	 */
	private final int component;

	/**
	 * A {@link ShowNpcModelOnComponentMessage} is used to display a
	 * non-player-character's head model onto an interface component.
	 * 
	 * @param npc
	 *            The npc id.
	 * @param component
	 *            The interface component.
	 */
	public ShowNpcModelOnComponentMessage(final int npc, final int component)
	{
		this.npc = npc;
		this.component = component;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(5).writeByte(75).writeShort(this.npc)
				.writeShort(this.component);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
