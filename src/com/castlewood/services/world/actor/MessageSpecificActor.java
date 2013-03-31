package com.castlewood.services.world.actor;

public abstract class MessageSpecificActor<A extends Actor<A>, M extends ActorMessage<A>>
		implements Actor<A>
{

	@Override
	public boolean accept(ActorMessage<A> message)
	{
		return evaluate((M) message);
	}
	
	protected abstract boolean evaluate(M message);

}
