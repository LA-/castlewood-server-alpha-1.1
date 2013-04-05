package com.castlewood;

import com.castlewood.actor.Message;
import com.castlewood.actor.MessageAcceptor;
import com.castlewood.actor.MessageAcceptorCarrier;
import com.castlewood.actor.services.AbstractService;

public class Server extends MessageAcceptorCarrier
{

	public Server()
	{
		super(new MessageAcceptor<?>[] {

		});
	}

	@Override
	public void register(MessageAcceptor<? extends Message> acceptor)
	{
		if (acceptor instanceof AbstractService)
		{
			if (AbstractService.class.cast(acceptor).initiate())
			{
				super.register(acceptor);
			}
		}
	}

}
