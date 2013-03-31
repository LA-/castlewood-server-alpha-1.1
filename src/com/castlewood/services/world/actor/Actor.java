package com.castlewood.services.world.actor;

public interface Actor<A extends Actor<A>>
{

	public boolean accept(ActorMessage<A> message);

}
