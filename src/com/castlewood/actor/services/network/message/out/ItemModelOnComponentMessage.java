package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This is used to show an item model on an interface component.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class ItemModelOnComponentMessage extends NetworkMessage
{

	/**
	 * The interface component.
	 */
	private final int component;

	/**
	 * The amount of zoom that should be applied to the model.
	 */
	private final int zoom;

	/**
	 * The model or item id.
	 */
	private final int model;

	/**
	 * A {@link ItemModelOnComponentMessage} is created with a component in
	 * which the item will be displayed, the amount of zoom for the item, and
	 * the actual item id.
	 * 
	 * @param component
	 *            The component.
	 * @param zoom
	 *            The zoom.
	 * @param model
	 *            The item id.
	 */
	public ItemModelOnComponentMessage(final int component, final int zoom,
			final int model)
	{
		this.component = component;
		this.zoom = zoom;
		this.model = model;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(7).writeByte(246).writeShort(this.component)
				.writeShort(this.zoom).writeShort(this.model);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
