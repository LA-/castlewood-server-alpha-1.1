package com.castlewood.actor.services.network.message.out;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * This is sent to the client upon registration. It indicates if the player is a
 * members' account and the index of the player.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class IndexAssignmentMessage extends NetworkMessage
{

	/**
	 * This determines if a player is a members' account or not.
	 */
	private final boolean members;

	/**
	 * This index is used so that the client can update players correctly.
	 */
	private final int index;

	/**
	 * A new {@link IndexAssignmentMessage} is created with information of a
	 * player being a members' account and the player's index.
	 * 
	 * @param members
	 *            The player's members' status.
	 * @param index
	 *            The index of the player.
	 */
	public IndexAssignmentMessage(final boolean members, final int index)
	{
		this.members = members;
		this.index = index;
	}

	@Override
	public ByteBuf encode()
	{
		return Unpooled.buffer(4).writeByte(this.members ? 1 : 0)
				.writeShort(this.index);
	}

	@Override
	public void decode(final ByteBuf buffer)
	{
		throw new UnsupportedOperationException(this.getClass()
				.getCanonicalName() + " is an outbound network message.");
	}

}
