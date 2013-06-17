package com.castlewood.actor.services.network.pipeline.game;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.MessageList;

import com.castlewood.actor.services.network.message.NetworkMessage;
import com.castlewood.actor.services.network.message.NetworkMessageManager;
import com.castlewood.actor.services.world.entity.mobile.player.Player;

/**
 * The {@link GameMessageReceiver} handles decoded {@link NetworkMessage
 * NetworkMessages}.
 * 
 * @author William Nguyen <L__A> <larevxpk@gmail.com>
 * 
 */
public class GameMessageReceiver extends ChannelInboundHandlerAdapter
{

	@Override
	public void messageReceived(ChannelHandlerContext ctx,
			MessageList<Object> msgs) throws Exception
	{
		for (Object message : msgs)
		{
			NetworkMessageManager.handler((NetworkMessage) message).handle(
					ctx.channel().attr(Player.KEY).get(),
					(NetworkMessage) message);
		}
	}

}
