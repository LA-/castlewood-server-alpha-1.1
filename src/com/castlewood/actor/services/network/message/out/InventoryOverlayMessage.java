package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This opens a normal window as well as an overlay over the inventory.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class InventoryOverlayMessage extends NetworkMessage
{

	/**
	 * The normal window to open.
	 */
	private final int window;

	/**
	 * The inventory overlay.
	 */
	private final int overlay;

	/**
	 * This creates a new {@link InventoryOverlayMessage} to send to the client.
	 * 
	 * @param window
	 *            The normal window interface.
	 * @param overlay
	 *            The inventory overlay interface.
	 */
	public InventoryOverlayMessage(final int window, final int overlay)
	{
		this.window = window;
		this.overlay = overlay;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(5).writeShort(this.window)
				.writeShort(this.overlay);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
