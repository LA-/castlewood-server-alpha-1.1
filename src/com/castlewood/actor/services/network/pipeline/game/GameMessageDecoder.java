package com.castlewood.actor.services.network.pipeline.game;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.MessageList;
import io.netty.handler.codec.ByteToMessageDecoder;

import com.castlewood.actor.services.network.Client;
import com.castlewood.actor.services.network.message.NetworkMessage;
import com.castlewood.actor.services.network.message.NetworkMessageManager;

/**
 * The {@link GameMessageDecoder} decodes incoming bytes and turns them into
 * {@link NetworkMessage NetworkMessages}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class GameMessageDecoder extends ByteToMessageDecoder
{

	@Override
	protected void decode(final ChannelHandlerContext ctx, final ByteBuf in,
			final MessageList<Object> out) throws Exception
	{
		final int opcode = in.readUnsignedByte()
				- ctx.channel().attr(Client.KEY).get().decoder().nextInt()
				& 0xFF;
		final NetworkMessage message = NetworkMessageManager.message(opcode);
		message.decode(in);
		out.add(message);
	}

}
