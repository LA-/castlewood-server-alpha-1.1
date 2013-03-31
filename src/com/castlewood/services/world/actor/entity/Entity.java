package com.castlewood.services.world.actor.entity;

import java.util.HashMap;
import java.util.Map;

import com.castlewood.services.world.actor.AbstractActor;
import com.castlewood.services.world.actor.Actor;
import com.castlewood.services.world.actor.ActorMessage;
import com.castlewood.services.world.actor.message.LocationTranslationMessage;

public class Entity extends AbstractActor<Entity>
{

	private Map<Class<? extends ActorMessage<Entity>>, Actor<Entity>> actors = new HashMap<>();

	public Entity()
	{
		actors.put(LocationTranslationMessage.class,
				new Location(3200, 3200, 0));
	}

	@Override
	public void executeMessages()
	{
		for (ActorMessage<Entity> message = inbox().iterator().next(); inbox()
				.iterator().hasNext();)
		{
			if (message.recipient() == this)
			{
				Actor<Entity> actor = actors.get(message.getClass());
				if (!actor.accept(message))
				{
					break;
				}
			}
			inbox().iterator().remove();
		}
	}

	public Actor<Entity> actor(Class<? extends ActorMessage<Entity>> message)
	{
		return actors.get(message);
	}

}
