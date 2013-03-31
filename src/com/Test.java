package com;

import com.castlewood.services.world.actor.entity.Entity;
import com.castlewood.services.world.actor.entity.Location;
import com.castlewood.services.world.actor.message.LocationTranslationMessage;

public class Test
{

	public static void main(String... args)
	{
		Entity entity = new Entity();
		System.out.println(((Location) entity
				.actor(LocationTranslationMessage.class)).x());
		entity.accept(new LocationTranslationMessage(entity, 20, 0, 0));
		entity.executeMessages();
		System.out.println(((Location) entity
				.actor(LocationTranslationMessage.class)).x());
	}

}
