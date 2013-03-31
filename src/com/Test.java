package com;

import com.castlewood.services.world.actor.MessageAcceptorCarrier;
import com.castlewood.services.world.actor.entity.Entity;
import com.castlewood.services.world.actor.entity.Location;
import com.castlewood.services.world.actor.message.LocationChangeMessage;
import com.castlewood.services.world.actor.message.LocationTranslationMessage;

public class Test
{

	public static void main(String... args)
	{
		MessageAcceptorCarrier entity = new Entity();
		Location location = entity.acceptor(Location.class);
		System.out.println(location.x() + ", " + location.y() + ", "
				+ location.height());
		entity.accept(new LocationChangeMessage(1200, 1200, 1));
		entity.accept(new LocationTranslationMessage(1, 2, 3));
		entity.evalute();
		System.out.println(location.x() + ", " + location.y() + ", "
				+ location.height());
	}

}
