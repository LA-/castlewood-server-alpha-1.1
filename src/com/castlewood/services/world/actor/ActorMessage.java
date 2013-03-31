package com.castlewood.services.world.actor;

public interface ActorMessage<A extends Actor<A>>
{
	
	public A recipient();

}
