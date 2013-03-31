package com.castlewood.services.world.actor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class AbstractActor<A extends Actor<A>> implements Actor<A>
{

	private BlockingQueue<ActorMessage<A>> inbox = new LinkedBlockingQueue<>();

	public abstract void executeMessages();

	@Override
	public boolean accept(ActorMessage<A> message)
	{
		return inbox.offer(message);
	}

	protected BlockingQueue<ActorMessage<A>> inbox()
	{
		return inbox;
	}

}
