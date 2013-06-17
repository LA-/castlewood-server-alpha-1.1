package com.castlewood.actor.services.network.pipeline.game;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import com.castlewood.actor.services.network.Client;
import com.castlewood.actor.services.network.message.NetworkMessage;

/**
 * The {@link GameMessageEncoder} encodes {@link NetworkMessage NetworkMessages}
 * so that they are readable to the connecting {@link Client}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class GameMessageEncoder extends MessageToByteEncoder<NetworkMessage>
{

	@Override
	protected void encode(final ChannelHandlerContext ctx,
			final NetworkMessage msg, final ByteBuf out) throws Exception
	{
		out.writeBytes(msg.encode());
		out.setByte(0, out.getByte(0)
				+ ctx.channel().attr(Client.KEY).get().encoder().nextInt());
	}

}
