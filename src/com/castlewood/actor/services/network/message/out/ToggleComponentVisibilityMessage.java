package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This toggles the visibility on a component on an interface.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class ToggleComponentVisibilityMessage extends NetworkMessage
{

	/**
	 * The visibility of the component.
	 */
	private final boolean visible;

	/**
	 * The component to toggle.
	 */
	private final int component;

	/**
	 * A {@link ToggleComponentVisibilityMessage} is used to either show or hide
	 * a component on an interface.
	 * 
	 * @param visible
	 *            The visibility of the component.
	 * @param component
	 *            The component.
	 */
	public ToggleComponentVisibilityMessage(final boolean visible,
			final int component)
	{
		this.visible = visible;
		this.component = component;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(4).writeByte(171)
				.writeByte(this.visible ? 1 : 0).writeShort(this.component);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
